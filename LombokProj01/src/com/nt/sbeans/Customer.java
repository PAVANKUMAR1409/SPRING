package com.nt.sbeans;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Customer 
{
//	@Setter
//	@Getter
	private int cNo;
	private String cName;
	private String cAdd;
//	@Setter
//	@Getter
	private float billAmt;
	
}
