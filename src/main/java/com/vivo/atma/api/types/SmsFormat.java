//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.03.14 às 07:37:18 PM BRT 
//


package com.vivo.atma.api.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SmsFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SmsFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ems"/&gt;
 *     &lt;enumeration value="SmartMessaging"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SmsFormat", namespace = "http://www.csapi.org/schema/parlayx/sms/v2_2")
@XmlEnum
public enum SmsFormat {

    @XmlEnumValue("Ems")
    EMS("Ems"),
    @XmlEnumValue("SmartMessaging")
    SMART_MESSAGING("SmartMessaging");
    private final String value;

    SmsFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmsFormat fromValue(String v) {
        for (SmsFormat c: SmsFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
