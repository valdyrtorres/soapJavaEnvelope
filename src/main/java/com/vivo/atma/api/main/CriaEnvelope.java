package com.vivo.atma.api.main;

import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

public class CriaEnvelope {
	public static void main(String[] args) throws Exception {
		//createSOAPRequest();
		//ExemploComSoapEnv();
		//ExemploSoapRequest();
		EnvelopeCompleto();
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
	
	private static SOAPMessage createSOAPRequest() throws Exception
	{
	        MessageFactory messageFactory = MessageFactory.newInstance();
	        SOAPMessage soapMessage = messageFactory.createMessage();
	        SOAPPart soapPart = soapMessage.getSOAPPart();
	        // SOAP Envelope
	        SOAPEnvelope envelope = soapPart.getEnvelope();
	        envelope.addNamespaceDeclaration("xsd", "http://www.w3.org/2001/XMLSchema");
	        envelope.addNamespaceDeclaration("xsi", "http://www.w3.org/2001/XMLSchema-instance");
	        envelope.addNamespaceDeclaration("ns3", "http://www.csapi.org/schema/parlayx/common/v2_1");
	        // SOAP Body
	        SOAPBody soapBody = envelope.getBody();
	        SOAPElement soapBodyElem = soapBody.addChildElement("employee", "ns3");
	        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("id", "ns3");
	        soapBodyElem1.addTextNode("10");
	        soapMessage.saveChanges();
	        System.out.println("Request SOAP Message = ");
	        soapMessage.writeTo(System.out);
	        System.out.println();
	        return soapMessage;
	}
	
	private static SOAPMessage ExemploComSoapEnv() throws SOAPException, IOException {
		 MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL); 
		 SOAPMessage soapMessage = messageFactory.createMessage(); 
		 SOAPPart soapPart = soapMessage.getSOAPPart(); 
		 SOAPEnvelope soapEnvelope = soapPart.getEnvelope(); 
		 
		 SOAPHeader header = soapEnvelope.getHeader();
		 if (header == null)
			  header = soapEnvelope.addHeader();
		 final SOAPElement security = header.addChildElement("Security", "wsse",
			    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
		 final SOAPElement userToken = security.addChildElement("UsernameToken", "wsse");
		 
		 SOAPBody soapBody = soapEnvelope.getBody(); 
		 soapEnvelope.removeNamespaceDeclaration(soapEnvelope.getPrefix()); 
		 soapEnvelope.addNamespaceDeclaration("soapenv", "http://schemas.xmlsoap.org/soap/envelope/"); 
		 soapEnvelope.setPrefix("soapenv"); 
		 soapEnvelope.getHeader().setPrefix("soapenv");
		 soapBody.setPrefix("soapenv"); 
		 soapEnvelope.addNamespaceDeclaration("xsi", "http://www.w3.org/2001/XMLSchema-instance"); 
		 soapEnvelope.addNamespaceDeclaration("xsd", "http://www.w3.org/2001/XMLSchema");   		 
		 
		 soapMessage.saveChanges();
	     System.out.println("Request SOAP Message = ");
	     soapMessage.writeTo(System.out);
	     System.out.println();
		 
		 return soapMessage;
	}
	
	private static SOAPMessage ExemploSoapRequest() throws SOAPException, IOException {
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();

		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration("ns", "website");
		envelope.addNamespaceDeclaration("com", "website/Common");
		envelope.addNamespaceDeclaration("xm", "http://www.w3.org/2005/05/xmlmime");
		SOAPBody soapBody = envelope.getBody();
		SOAPElement element = soapBody.addChildElement("RequestName", "ns");
		SOAPElement modelElement = element.addChildElement("model", "ns");
		SOAPElement soapElement = modelElement.addChildElement("keys", "ns");
		soapElement.addAttribute(envelope.createName("query"), "myquery;");
		modelElement.addChildElement("instance", "ns");
		
		SOAPHeader header = envelope.getHeader();
		if (header == null)
		  header = envelope.addHeader();
		final SOAPElement security = header.addChildElement("Security", "wsse",
		    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
		final SOAPElement userToken = security.addChildElement("UsernameToken", "wsse");

		soapMessage.saveChanges();
		soapMessage.writeTo(System.out);
		System.out.println();
		 
		return soapMessage;
	}
	
}
