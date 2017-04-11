
package com.horstmann.amazon;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="MarketplaceDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AWSAccessKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociateTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Validate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLEscaping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}ItemLookupRequest" minOccurs="0"/>
 *         &lt;element name="Request" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}ItemLookupRequest" maxOccurs="unbounded" minOccurs="0"/>
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
    "marketplaceDomain",
    "awsAccessKeyId",
    "associateTag",
    "validate",
    "xmlEscaping",
    "shared",
    "request"
})
@XmlRootElement(name = "ItemLookup")
public class ItemLookup {

    @XmlElement(name = "MarketplaceDomain")
    protected String marketplaceDomain;
    @XmlElement(name = "AWSAccessKeyId")
    protected String awsAccessKeyId;
    @XmlElement(name = "AssociateTag")
    protected String associateTag;
    @XmlElement(name = "Validate")
    protected String validate;
    @XmlElement(name = "XMLEscaping")
    protected String xmlEscaping;
    @XmlElement(name = "Shared")
    protected ItemLookupRequest shared;
    @XmlElement(name = "Request")
    protected List<ItemLookupRequest> request;

    /**
     * 获取marketplaceDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplaceDomain() {
        return marketplaceDomain;
    }

    /**
     * 设置marketplaceDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplaceDomain(String value) {
        this.marketplaceDomain = value;
    }

    /**
     * 获取awsAccessKeyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWSAccessKeyId() {
        return awsAccessKeyId;
    }

    /**
     * 设置awsAccessKeyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWSAccessKeyId(String value) {
        this.awsAccessKeyId = value;
    }

    /**
     * 获取associateTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateTag() {
        return associateTag;
    }

    /**
     * 设置associateTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateTag(String value) {
        this.associateTag = value;
    }

    /**
     * 获取validate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidate() {
        return validate;
    }

    /**
     * 设置validate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidate(String value) {
        this.validate = value;
    }

    /**
     * 获取xmlEscaping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLEscaping() {
        return xmlEscaping;
    }

    /**
     * 设置xmlEscaping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLEscaping(String value) {
        this.xmlEscaping = value;
    }

    /**
     * 获取shared属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemLookupRequest }
     *     
     */
    public ItemLookupRequest getShared() {
        return shared;
    }

    /**
     * 设置shared属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLookupRequest }
     *     
     */
    public void setShared(ItemLookupRequest value) {
        this.shared = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLookupRequest }
     * 
     * 
     */
    public List<ItemLookupRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<ItemLookupRequest>();
        }
        return this.request;
    }

}
