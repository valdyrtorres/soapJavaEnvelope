//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.03.14 às 07:38:44 PM BRT 
//


package com.vivo.atma.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sendSmsRingtone complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sendSmsRingtone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addresses" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="charging" type="{http://www.csapi.org/schema/parlayx/common/v2_1}ChargingInformation" minOccurs="0"/&gt;
 *         &lt;element name="ringtone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="smsFormat" type="{http://www.csapi.org/schema/parlayx/sms/v2_2}SmsFormat"/&gt;
 *         &lt;element name="receiptRequest" type="{http://www.csapi.org/schema/parlayx/common/v2_1}SimpleReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSmsRingtone", propOrder = {
    "addresses",
    "senderName",
    "charging",
    "ringtone",
    "smsFormat",
    "receiptRequest"
})
public class SendSmsRingtone {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> addresses;
    protected String senderName;
    protected ChargingInformation charging;
    @XmlElement(required = true)
    protected String ringtone;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SmsFormat smsFormat;
    protected SimpleReference receiptRequest;

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
     * Obtém o valor da propriedade ringtone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingtone() {
        return ringtone;
    }

    /**
     * Define o valor da propriedade ringtone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingtone(String value) {
        this.ringtone = value;
    }

    /**
     * Obtém o valor da propriedade smsFormat.
     * 
     * @return
     *     possible object is
     *     {@link SmsFormat }
     *     
     */
    public SmsFormat getSmsFormat() {
        return smsFormat;
    }

    /**
     * Define o valor da propriedade smsFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsFormat }
     *     
     */
    public void setSmsFormat(SmsFormat value) {
        this.smsFormat = value;
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

}
