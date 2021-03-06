// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201308.reportservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201308.ReportDownloader;
import com.google.api.ads.dfp.axis.v201308.Column;
import com.google.api.ads.dfp.axis.v201308.DateRangeType;
import com.google.api.ads.dfp.axis.v201308.Dimension;
import com.google.api.ads.dfp.axis.v201308.ExportFormat;
import com.google.api.ads.dfp.axis.v201308.ReportJob;
import com.google.api.ads.dfp.axis.v201308.ReportQuery;
import com.google.api.ads.dfp.axis.v201308.ReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.ReportCallback;
import com.google.api.client.auth.oauth2.Credential;

import java.io.File;
import java.io.IOException;

/**
 * This example downloads a report asynchronously using a callback.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ReportService.runReportJob
 *
 * @author Adam Rogal
 */
public class AsyncDownloadReport {

  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws Exception {
    // Get the ReportService.
    ReportServiceInterface reportService = dfpServices.get(session, ReportServiceInterface.class);

    // Create report query.
    ReportQuery reportQuery = new ReportQuery();
    reportQuery.setDimensions(new Dimension[] {Dimension.DATE, Dimension.ORDER_ID});
    reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS});

    // Set the dynamic date range type or a custom start and end date.
    reportQuery.setDateRangeType(DateRangeType.LAST_WEEK);

    // Create report job.
    ReportJob reportJob = new ReportJob();
    reportJob.setReportQuery(reportQuery);

    // Run report job.
    reportJob = reportService.runReportJob(reportJob);

    // Create report downloader.
    final ReportDownloader reportDownloader =
        new ReportDownloader(reportService, reportJob.getId());

    reportDownloader.whenReportReady(new ReportCallback() {
      public void onSuccess() {
        try {
          // Change to your file location.
          String filePath = File.createTempFile("async-report-", ".csv.gz").toString();

          System.out.printf("Downloading report to %s ...", filePath);

          // Download the report.
          reportDownloader.downloadReport(ExportFormat.CSV_DUMP, filePath);

          System.out.println("done.");
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

      public void onInterruption() {
        System.err.println("Report download interupted.");
      }

      public void onFailure() {
        System.err.println("Report download failed.");
      }

      public void onException(Exception e) {
        System.err.println("Report download failed.");
        e.printStackTrace();
      }
    });
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
