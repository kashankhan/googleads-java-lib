
package com.google.api.ads.dfp.jaxws.v201208;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link Team} objects.
 *             
 *             @param teams the teams to update
 *             @return the updated teams
 *           
 * 
 * <p>Java class for updateTeams element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateTeams">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="teams" type="{https://www.google.com/apis/ads/publisher/v201208}Team" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teams"
})
@XmlRootElement(name = "updateTeams")
public class TeamServiceInterfaceupdateTeams {

    protected List<Team> teams;

    /**
     * Gets the value of the teams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Team }
     * 
     * 
     */
    public List<Team> getTeams() {
        if (teams == null) {
            teams = new ArrayList<Team>();
        }
        return this.teams;
    }

}
