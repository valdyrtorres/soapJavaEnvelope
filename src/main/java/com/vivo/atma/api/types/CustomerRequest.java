//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.03.14 às 07:37:18 PM BRT 
//


package com.vivo.atma.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="yearlyIncome" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cibilScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="employmentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerName",
    "age",
    "yearlyIncome",
    "cibilScore",
    "employmentMode"
})
@XmlRootElement(name = "CustomerRequest", namespace = "http://www.tools.com/spring/soap/api/loanEligibility")
public class CustomerRequest {

    @XmlElement(namespace = "http://www.tools.com/spring/soap/api/loanEligibility", required = true)
    protected String customerName;
    @XmlElement(namespace = "http://www.tools.com/spring/soap/api/loanEligibility")
    protected int age;
    @XmlElement(namespace = "http://www.tools.com/spring/soap/api/loanEligibility")
    protected long yearlyIncome;
    @XmlElement(namespace = "http://www.tools.com/spring/soap/api/loanEligibility")
    protected int cibilScore;
    @XmlElement(namespace = "http://www.tools.com/spring/soap/api/loanEligibility", required = true)
    protected String employmentMode;

    /**
     * Obtém o valor da propriedade customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define o valor da propriedade customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtém o valor da propriedade age.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Define o valor da propriedade age.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Obtém o valor da propriedade yearlyIncome.
     * 
     */
    public long getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * Define o valor da propriedade yearlyIncome.
     * 
     */
    public void setYearlyIncome(long value) {
        this.yearlyIncome = value;
    }

    /**
     * Obtém o valor da propriedade cibilScore.
     * 
     */
    public int getCibilScore() {
        return cibilScore;
    }

    /**
     * Define o valor da propriedade cibilScore.
     * 
     */
    public void setCibilScore(int value) {
        this.cibilScore = value;
    }

    /**
     * Obtém o valor da propriedade employmentMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentMode() {
        return employmentMode;
    }

    /**
     * Define o valor da propriedade employmentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentMode(String value) {
        this.employmentMode = value;
    }

}
