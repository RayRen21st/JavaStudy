//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.17 at 05:32:18 PM CST 
//


package com.rr.study.j2se.xml.jaxb.shool.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GradeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GradeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GradeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GradeType", propOrder = {
    "gradeNumber"
})
public class GradeType {

    @XmlElement(name = "GradeNumber")
    protected int gradeNumber;

    /**
     * Gets the value of the gradeNumber property.
     * 
     */
    public int getGradeNumber() {
        return gradeNumber;
    }

    /**
     * Sets the value of the gradeNumber property.
     * 
     */
    public void setGradeNumber(int value) {
        this.gradeNumber = value;
    }

}
