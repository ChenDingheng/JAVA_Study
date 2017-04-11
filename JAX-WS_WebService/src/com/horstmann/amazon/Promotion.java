
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
 *         &lt;element name="Summary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EligibilityRequirementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BenefitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "summary"
})
@XmlRootElement(name = "Promotion")
public class Promotion {

    @XmlElement(name = "Summary")
    protected Promotion.Summary summary;

    /**
     * 获取summary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Promotion.Summary }
     *     
     */
    public Promotion.Summary getSummary() {
        return summary;
    }

    /**
     * 设置summary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion.Summary }
     *     
     */
    public void setSummary(Promotion.Summary value) {
        this.summary = value;
    }


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
     *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EligibilityRequirementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BenefitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "promotionId",
        "category",
        "startDate",
        "endDate",
        "eligibilityRequirementDescription",
        "benefitDescription",
        "termsAndConditions"
    })
    public static class Summary {

        @XmlElement(name = "PromotionId", required = true)
        protected String promotionId;
        @XmlElement(name = "Category")
        protected String category;
        @XmlElement(name = "StartDate")
        protected String startDate;
        @XmlElement(name = "EndDate")
        protected String endDate;
        @XmlElement(name = "EligibilityRequirementDescription")
        protected String eligibilityRequirementDescription;
        @XmlElement(name = "BenefitDescription")
        protected String benefitDescription;
        @XmlElement(name = "TermsAndConditions")
        protected String termsAndConditions;

        /**
         * 获取promotionId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionId() {
            return promotionId;
        }

        /**
         * 设置promotionId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionId(String value) {
            this.promotionId = value;
        }

        /**
         * 获取category属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * 设置category属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * 获取startDate属性的值。
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
         * 设置startDate属性的值。
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
         * 获取endDate属性的值。
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
         * 设置endDate属性的值。
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
         * 获取eligibilityRequirementDescription属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEligibilityRequirementDescription() {
            return eligibilityRequirementDescription;
        }

        /**
         * 设置eligibilityRequirementDescription属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEligibilityRequirementDescription(String value) {
            this.eligibilityRequirementDescription = value;
        }

        /**
         * 获取benefitDescription属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBenefitDescription() {
            return benefitDescription;
        }

        /**
         * 设置benefitDescription属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBenefitDescription(String value) {
            this.benefitDescription = value;
        }

        /**
         * 获取termsAndConditions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermsAndConditions() {
            return termsAndConditions;
        }

        /**
         * 设置termsAndConditions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermsAndConditions(String value) {
            this.termsAndConditions = value;
        }

    }

}
