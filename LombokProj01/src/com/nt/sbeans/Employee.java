package com.nt.sbeans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee 
{
	@NonNull
	private Integer eId;
	private String eName;
	private String eAdd;
}
