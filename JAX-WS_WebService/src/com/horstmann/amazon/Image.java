
package com.horstmann.amazon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Image complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits"/>
 *         &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "url",
    "height",
    "width",
    "isVerified"
})
public class Image {

    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "Height", required = true)
    protected DecimalWithUnits height;
    @XmlElement(name = "Width", required = true)
    protected DecimalWithUnits width;
    @XmlElement(name = "IsVerified")
    protected String isVerified;

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setHeight(DecimalWithUnits value) {
        this.height = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setWidth(DecimalWithUnits value) {
        this.width = value;
    }

    /**
     * 获取isVerified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVerified() {
        return isVerified;
    }

    /**
     * 设置isVerified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVerified(String value) {
        this.isVerified = value;
    }

}
