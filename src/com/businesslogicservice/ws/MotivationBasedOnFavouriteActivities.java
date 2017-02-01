
package com.businesslogicservice.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.storageservice.sport.ws.Activity;


/**
 * <p>Java class for motivationBasedOnFavouriteActivities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motivationBasedOnFavouriteActivities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="favouriteActivities" type="{http://ws.sport.storageservice.com/}activity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivationBasedOnFavouriteActivities", propOrder = {
    "favouriteActivities"
})
public class MotivationBasedOnFavouriteActivities {

    protected List<Activity> favouriteActivities;

    /**
     * Gets the value of the favouriteActivities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the favouriteActivities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFavouriteActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getFavouriteActivities() {
        if (favouriteActivities == null) {
            favouriteActivities = new ArrayList<Activity>();
        }
        return this.favouriteActivities;
    }

}
