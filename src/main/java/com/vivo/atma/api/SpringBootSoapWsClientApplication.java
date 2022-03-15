package com.vivo.atma.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivo.atma.api.DTO.SmsDTO;
import com.vivo.atma.api.client.SoapClient;
import com.vivo.atma.api.sendsms.Acknowledgement;
import com.vivo.atma.api.sendsms.CustomerRequest;
import com.vivo.atma.api.sendsms.SendSms;
import com.vivo.atma.api.sendsms.SendSmsResponse;


@SpringBootApplication
@RestController
public class SpringBootSoapWsClientApplication {
	
	@Autowired
	private SoapClient cliente;
	
	@PostMapping("getLoanStatus")
	public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
		return cliente.getLoanStatus(request);
	}
	
	@PostMapping("sendSms")
	public String invokeSoapClientToSendSms(@RequestBody SmsDTO request) {
		return cliente.sendSms(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWsClientApplication.class, args);
	}

}
