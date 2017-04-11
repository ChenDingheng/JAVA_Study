
package com.horstmann.amazon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowestNewPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestUsedPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestCollectiblePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestRefurbishedPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="TotalNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalCollectible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalRefurbished" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lowestNewPrice",
    "lowestUsedPrice",
    "lowestCollectiblePrice",
    "lowestRefurbishedPrice",
    "totalNew",
    "totalUsed",
    "totalCollectible",
    "totalRefurbished"
})
@XmlRootElement(name = "OfferSummary")
public class OfferSummary {

    @XmlElement(name = "LowestNewPrice")
    protected Price lowestNewPrice;
    @XmlElement(name = "LowestUsedPrice")
    protected Price lowestUsedPrice;
    @XmlElement(name = "LowestCollectiblePrice")
    protected Price lowestCollectiblePrice;
    @XmlElement(name = "LowestRefurbishedPrice")
    protected Price lowestRefurbishedPrice;
    @XmlElement(name = "TotalNew")
    protected String totalNew;
    @XmlElement(name = "TotalUsed")
    protected String totalUsed;
    @XmlElement(name = "TotalCollectible")
    protected String totalCollectible;
    @XmlElement(name = "TotalRefurbished")
    protected String totalRefurbished;

    /**
     * 获取lowestNewPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestNewPrice() {
        return lowestNewPrice;
    }

    /**
     * 设置lowestNewPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestNewPrice(Price value) {
        this.lowestNewPrice = value;
    }

    /**
     * 获取lowestUsedPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestUsedPrice() {
        return lowestUsedPrice;
    }

    /**
     * 设置lowestUsedPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestUsedPrice(Price value) {
        this.lowestUsedPrice = value;
    }

    /**
     * 获取lowestCollectiblePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestCollectiblePrice() {
        return lowestCollectiblePrice;
    }

    /**
     * 设置lowestCollectiblePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestCollectiblePrice(Price value) {
        this.lowestCollectiblePrice = value;
    }

    /**
     * 获取lowestRefurbishedPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestRefurbishedPrice() {
        return lowestRefurbishedPrice;
    }

    /**
     * 设置lowestRefurbishedPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestRefurbishedPrice(Price value) {
        this.lowestRefurbishedPrice = value;
    }

    /**
     * 获取totalNew属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNew() {
        return totalNew;
    }

    /**
     * 设置totalNew属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNew(String value) {
        this.totalNew = value;
    }

    /**
     * 获取totalUsed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalUsed() {
        return totalUsed;
    }

    /**
     * 设置totalUsed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalUsed(String value) {
        this.totalUsed = value;
    }

    /**
     * 获取totalCollectible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCollectible() {
        return totalCollectible;
    }

    /**
     * 设置totalCollectible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCollectible(String value) {
        this.totalCollectible = value;
    }

    /**
     * 获取totalRefurbished属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRefurbished() {
        return totalRefurbished;
    }

    /**
     * 设置totalRefurbished属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRefurbished(String value) {
        this.totalRefurbished = value;
    }

}
