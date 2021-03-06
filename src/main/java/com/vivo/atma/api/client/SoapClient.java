package com.vivo.atma.api.client;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.vivo.atma.api.DTO.SmsDTO;
import com.vivo.atma.api.sendsms.Acknowledgement;
import com.vivo.atma.api.sendsms.CustomerRequest;

@Service
public class SoapClient {
	
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
	
	public Acknowledgement getLoanStatus(CustomerRequest request) {
		template = new WebServiceTemplate(marshaller);
		Acknowledgement acknowledgement = (Acknowledgement) template.marshalSendAndReceive("http://localhost:8080/ws", request);
		
		return acknowledgement;
	}
	
	public String sendSms(SmsDTO request) {
		String soapEndpointUrl = "https://prm-hml.vivo.com.br/osg/services/SendSmsService";
		return callSoapSendSmsWebService(soapEndpointUrl);
	}
	
	private String callSoapSendSmsWebService(String soapEndpointUrl) {
		
		ByteArrayOutputStream outSoapResponse = new ByteArrayOutputStream();
    	
        try {
        	
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(EnvelopeSendSms(), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            
            soapResponse.writeTo(outSoapResponse);      ;  
            soapConnection.close();                   
            
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
        
        return new String(outSoapResponse.toByteArray());
    }
	
    private SOAPMessage EnvelopeSendSms() throws SOAPException, IOException {
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
