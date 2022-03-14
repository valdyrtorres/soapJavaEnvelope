//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.03.14 às 07:49:02 PM BRT 
//


package com.vivo.atma.api.sendsms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sendSms complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sendSms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addresses" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="charging" type="{http://www.csapi.org/schema/parlayx/common/v2_1}ChargingInformation" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiptRequest" type="{http://www.csapi.org/schema/parlayx/common/v2_1}SimpleReference" minOccurs="0"/&gt;
 *         &lt;element name="encode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="destinationport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="esm_class" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="data_coding" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="promotionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="extendInfos" type="{http://www.csapi.org/schema/parlayx/sms/v2_2}NameParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSms", propOrder = {
    "addresses",
    "senderName",
    "charging",
    "message",
    "receiptRequest",
    "encode",
    "sourceport",
    "destinationport",
    "esmClass",
    "dataCoding",
    "promotionType",
    "extendInfos"
})
public class SendSms {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> addresses;
    protected String senderName;
    protected ChargingInformation charging;
    @XmlElement(required = true)
    protected String message;
    protected SimpleReference receiptRequest;
    protected String encode;
    protected Integer sourceport;
    protected Integer destinationport;
    @XmlElement(name = "esm_class")
    protected Integer esmClass;
    @XmlElement(name = "data_coding")
    protected Integer dataCoding;
    protected Integer promotionType;
    protected List<NameParameter> extendInfos;

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<String>();
        }
        return this.addresses;
    }

    /**
     * Obtém o valor da propriedade senderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Define o valor da propriedade senderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Obtém o valor da propriedade charging.
     * 
     * @return
     *     possible object is
     *     {@link ChargingInformation }
     *     
     */
    public ChargingInformation getCharging() {
        return charging;
    }

    /**
     * Define o valor da propriedade charging.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingInformation }
     *     
     */
    public void setCharging(ChargingInformation value) {
        this.charging = value;
    }

    /**
     * Obtém o valor da propriedade message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define o valor da propriedade message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtém o valor da propriedade receiptRequest.
     * 
     * @return
     *     possible object is
     *     {@link SimpleReference }
     *     
     */
    public SimpleReference getReceiptRequest() {
        return receiptRequest;
    }

    /**
     * Define o valor da propriedade receiptRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleReference }
     *     
     */
    public void setReceiptRequest(SimpleReference value) {
        this.receiptRequest = value;
    }

    /**
     * Obtém o valor da propriedade encode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncode() {
        return encode;
    }

    /**
     * Define o valor da propriedade encode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncode(String value) {
        this.encode = value;
    }

    /**
     * Obtém o valor da propriedade sourceport.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceport() {
        return sourceport;
    }

    /**
     * Define o valor da propriedade sourceport.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceport(Integer value) {
        this.sourceport = value;
    }

    /**
     * Obtém o valor da propriedade destinationport.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationport() {
        return destinationport;
    }

    /**
     * Define o valor da propriedade destinationport.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationport(Integer value) {
        this.destinationport = value;
    }

    /**
     * Obtém o valor da propriedade esmClass.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsmClass() {
        return esmClass;
    }

    /**
     * Define o valor da propriedade esmClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsmClass(Integer value) {
        this.esmClass = value;
    }

    /**
     * Obtém o valor da propriedade dataCoding.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataCoding() {
        return dataCoding;
    }

    /**
     * Define o valor da propriedade dataCoding.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataCoding(Integer value) {
        this.dataCoding = value;
    }

    /**
     * Obtém o valor da propriedade promotionType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromotionType() {
        return promotionType;
    }

    /**
     * Define o valor da propriedade promotionType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromotionType(Integer value) {
        this.promotionType = value;
    }

    /**
     * Gets the value of the extendInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameParameter }
     * 
     * 
     */
    public List<NameParameter> getExtendInfos() {
        if (extendInfos == null) {
            extendInfos = new ArrayList<NameParameter>();
        }
        return this.extendInfos;
    }

}
