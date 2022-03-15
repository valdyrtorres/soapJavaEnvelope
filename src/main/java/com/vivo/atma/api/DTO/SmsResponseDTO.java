package com.vivo.atma.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class SmsResponseDTO {
	
	private String msisdn;
	
	private String spId;
	
	private String productId;
	
	private String dest;
	
	private String serviceId;
	
	private String interfaceNameId;
	
	private String proxyOrigin;

}
