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
public class SmsDTO {
	
	private String address;
	
	private String senderName;
	
	private String message;
	
	private String endPoint;
	
	private String interfaceName;
	
	private String correlator;

}
