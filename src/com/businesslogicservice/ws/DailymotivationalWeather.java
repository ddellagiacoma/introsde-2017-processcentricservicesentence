
package com.businesslogicservice.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.storageservice.sport.ws.Sport;
import com.storageservice.weather.ws.Weather;


/**
 * <p>Java class for dailymotivationalWeather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dailymotivationalWeather">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sports" type="{http://ws.sport.storageservice.com/}sport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weather" type="{http://ws.weather.storageservice.com/}weather" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dailymotivationalWeather", propOrder = {
    "sports",
    "weather"
})
public class DailymotivationalWeather {

    protected List<Sport> sports;
    protected Weather weather;

    /**
     * Gets the value of the sports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sport }
     * 
     * 
     */
    public List<Sport> getSports() {
        if (sports == null) {
            sports = new ArrayList<Sport>();
        }
        return this.sports;
    }

    /**
     * Gets the value of the weather property.
     * 
     * @return
     *     possible object is
     *     {@link Weather }
     *     
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * Sets the value of the weather property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weather }
     *     
     */
    public void setWeather(Weather value) {
        this.weather = value;
    }

}
