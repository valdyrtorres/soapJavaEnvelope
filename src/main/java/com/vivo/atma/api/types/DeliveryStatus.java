//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.03.14 às 07:38:44 PM BRT 
//


package com.vivo.atma.api.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DeliveryStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DeliveredToNetwork"/&gt;
 *     &lt;enumeration value="DeliveryUncertain"/&gt;
 *     &lt;enumeration value="DeliveryImpossible"/&gt;
 *     &lt;enumeration value="MessageWaiting"/&gt;
 *     &lt;enumeration value="DeliveredToTerminal"/&gt;
 *     &lt;enumeration value="DeliveryNotificationNotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryStatus", namespace = "http://www.csapi.org/schema/parlayx/sms/v2_2")
@XmlEnum
public enum DeliveryStatus {

    @XmlEnumValue("DeliveredToNetwork")
    DELIVERED_TO_NETWORK("DeliveredToNetwork"),
    @XmlEnumValue("DeliveryUncertain")
    DELIVERY_UNCERTAIN("DeliveryUncertain"),
    @XmlEnumValue("DeliveryImpossible")
    DELIVERY_IMPOSSIBLE("DeliveryImpossible"),
    @XmlEnumValue("MessageWaiting")
    MESSAGE_WAITING("MessageWaiting"),
    @XmlEnumValue("DeliveredToTerminal")
    DELIVERED_TO_TERMINAL("DeliveredToTerminal"),
    @XmlEnumValue("DeliveryNotificationNotSupported")
    DELIVERY_NOTIFICATION_NOT_SUPPORTED("DeliveryNotificationNotSupported");
    private final String value;

    DeliveryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryStatus fromValue(String v) {
        for (DeliveryStatus c: DeliveryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
