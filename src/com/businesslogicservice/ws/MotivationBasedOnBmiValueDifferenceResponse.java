
package com.businesslogicservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motivationBasedOnBmiValueDifferenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motivationBasedOnBmiValueDifferenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivationBasedOnBmiValueDifferenceResponse", propOrder = {
    "sentence"
})
public class MotivationBasedOnBmiValueDifferenceResponse {

    protected String sentence;

    /**
     * Gets the value of the sentence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentence() {
        return sentence;
    }

    /**
     * Sets the value of the sentence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentence(String value) {
        this.sentence = value;
    }

}
