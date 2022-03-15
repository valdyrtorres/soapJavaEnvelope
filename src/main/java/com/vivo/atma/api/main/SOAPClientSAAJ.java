package com.vivo.atma.api.main;

import java.io.IOException;

import javax.xml.soap.*;

public class SOAPClientSAAJ {

    public static void main(String args[]) {

        String soapEndpointUrl = "https://prm-hml.vivo.com.br/osg/services/SendSmsService";
        String soapAction = "http://www.webserviceX.NET/GetInfoByCity";
        String soapXsd = "http://www.w3.org/2001/XMLSchema";
        String soapXsi = "http://www.w3.org/2001/XMLSchema-instance";

        callSoapWebService(soapEndpointUrl, soapAction);
    }
    
    private static void callSoapWebService(String soapEndpointUrl, String soapAction) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            //SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);
            SOAPMessage soapResponse = soapConnection.call(EnvelopeCompleto(), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }
    
    private static SOAPMessage createSOAPRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }

    private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String myNamespace = "ns3";
        String myNamespaceURI = "http://www.webserviceX.NET";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

            /*
            Constructed SOAP Request Message:
            <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:myNamespace="http://www.webserviceX.NET">
                <SOAP-ENV:Header/>
                <SOAP-ENV:Body>
                    <myNamespace:GetInfoByCity>
                        <myNamespace:USCity>New York</myNamespace:USCity>
                    </myNamespace:GetInfoByCity>
                </SOAP-ENV:Body>
            </SOAP-ENV:Envelope>
            */

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("sendSms", myNamespace);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("USCity", myNamespace);
        soapBodyElem1.addTextNode("New York");
    }
    
    private static SOAPMessage EnvelopeCompleto() throws SOAPException, IOException {
		 MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL); 
		 SOAPMessage soapMessage = messageFactory.createMessage(); 
		 SOAPPart soapPart = soapMessage.getSOAPPart(); 
		 SOAPEnvelope soapEnvelope = soapPart.getEnvelope(); 
		 
		 // Montagem Header
		 SOAPHeader header = soapEnvelope.getHeader();
		 if (header == null)
			  header = soapEnvelope.addHeader();
		 final SOAPElement requestSOAPHeader = header.addChildElement("RequestSOAPHeader", "ns3", "http://www.csapi.org/schema/parlayx/common/v2_1");
		 SOAPElement spIdElement = requestSOAPHeader.addChildElement("spId", "ns3");
		 spIdElement.addTextNode("000200");
		 
		 SOAPElement spPasswordElement = requestSOAPHeader.addChildElement("spPassword", "ns3");
		 spPasswordElement.addTextNode("0f9ad4a79e7e833f9b57613b308f0bfd");
		 
		 SOAPElement serviceId = requestSOAPHeader.addChildElement("serviceId", "ns3");
		 serviceId.addTextNode("0200000273");
		 
		 SOAPElement oA = requestSOAPHeader.addChildElement("OA", "ns3");
		 oA.addTextNode("5511995600237");
		 
		 SOAPElement timestamp = requestSOAPHeader.addChildElement("timeStamp", "ns3");
		 timestamp.addTextNode("20220311153746");
		 
		 // Fim Montagem Header
		 
		 SOAPBody soapBody = soapEnvelope.getBody(); 
		 soapEnvelope.removeNamespaceDeclaration(soapEnvelope.getPrefix()); 
		 soapEnvelope.addNamespaceDeclaration("soapenv", "http://schemas.xmlsoap.org/soap/envelope/"); 
		 soapEnvelope.setPrefix("soapenv"); 
		 soapEnvelope.getHeader().setPrefix("soapenv");
		 soapBody.setPrefix("soapenv"); 
		 soapEnvelope.addNamespaceDeclaration("xsi", "http://www.w3.org/2001/XMLSchema-instance"); 
		 soapEnvelope.addNamespaceDeclaration("xsd", "http://www.w3.org/2001/XMLSchema");   		 
		 
		 SOAPElement sendSmsElement = soapBody.addChildElement("sendSms", "ns3", "http://www.csapi.org/schema/parlayx/sms/send/v2_2/local");
		 SOAPElement addressesElement = sendSmsElement.addChildElement("addresses", "ns3");
		 addressesElement.addTextNode("tel:5511995600237");
		 
		 SOAPElement senderNameElement = sendSmsElement.addChildElement("senderName", "ns3");
		 senderNameElement.addTextNode("6104");
		 
		 SOAPElement messageElement = sendSmsElement.addChildElement("message", "ns3");
		 messageElement.addTextNode("hello,get method do Valdir 15/03");
		 
		 SOAPElement receiptRequestElement = sendSmsElement.addChildElement("receiptRequest", "ns3");
		 SOAPElement endpointElement = receiptRequestElement.addChildElement("endpoint");
		 endpointElement.addTextNode("http://10.70.136.150:8801/mockSendSmsSoapBinding");
		 SOAPElement interfaceNameElement = receiptRequestElement.addChildElement("interfaceName");
		 interfaceNameElement.addTextNode("receiveDeliveryStatus");
		 SOAPElement correlatorElement = receiptRequestElement.addChildElement("correlator");
		 correlatorElement.addTextNode("179099");
		 
		 soapMessage.saveChanges();
	     System.out.println("Request SOAP Message = ");
	     soapMessage.writeTo(System.out);
	     System.out.println();
		 
		 return soapMessage;
	}

}
