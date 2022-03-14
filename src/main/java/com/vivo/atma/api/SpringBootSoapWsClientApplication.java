package com.vivo.atma.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivo.atma.api.client.SoapClient;
import com.vivo.atma.api.types.Acknowledgement;
import com.vivo.atma.api.types.CustomerRequest;


@SpringBootApplication
@RestController
public class SpringBootSoapWsClientApplication {
	
	@Autowired
	private SoapClient cliente;
	
	@PostMapping("getLoanStatus")
	public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
		return cliente.getLoanStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWsClientApplication.class, args);
	}

}
