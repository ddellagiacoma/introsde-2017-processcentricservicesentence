
package com.businesslogicservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motivationBasedOnWeightDifference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motivationBasedOnWeightDifference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="goalWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weightDifference" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivationBasedOnWeightDifference", propOrder = {
    "idPerson",
    "startDate",
    "endDate",
    "startWeight",
    "goalWeight",
    "weightDifference"
})
public class MotivationBasedOnWeightDifference {

    protected int idPerson;
    protected String startDate;
    protected String endDate;
    protected double startWeight;
    protected double goalWeight;
    protected double weightDifference;

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startWeight property.
     * 
     */
    public double getStartWeight() {
        return startWeight;
    }

    /**
     * Sets the value of the startWeight property.
     * 
     */
    public void setStartWeight(double value) {
        this.startWeight = value;
    }

    /**
     * Gets the value of the goalWeight property.
     * 
     */
    public double getGoalWeight() {
        return goalWeight;
    }

    /**
     * Sets the value of the goalWeight property.
     * 
     */
    public void setGoalWeight(double value) {
        this.goalWeight = value;
    }

    /**
     * Gets the value of the weightDifference property.
     * 
     */
    public double getWeightDifference() {
        return weightDifference;
    }

    /**
     * Sets the value of the weightDifference property.
     * 
     */
    public void setWeightDifference(double value) {
        this.weightDifference = value;
    }

}
