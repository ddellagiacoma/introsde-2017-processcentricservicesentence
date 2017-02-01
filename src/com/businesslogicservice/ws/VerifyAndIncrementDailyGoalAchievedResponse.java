
package com.businesslogicservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.storageservice.person.ws.Person;


/**
 * <p>Java class for verifyAndIncrementDailyGoalAchievedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifyAndIncrementDailyGoalAchievedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentence" type="{http://ws.person.storageservice.com/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyAndIncrementDailyGoalAchievedResponse", propOrder = {
    "sentence"
})
public class VerifyAndIncrementDailyGoalAchievedResponse {

    protected Person sentence;

    /**
     * Gets the value of the sentence property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getSentence() {
        return sentence;
    }

    /**
     * Sets the value of the sentence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setSentence(Person value) {
        this.sentence = value;
    }

}
