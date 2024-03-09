package com.pack1;

public class Employee 
{
	private String eName;
	private int eId;
	private String eDept;
	
	public Employee(String eName, int eId, String eDept) 
	{
		this.eName = eName;
		this.eId = eId;
		this.eDept = eDept;
	}
	
	@Override
	public String toString()
	{
		return eName;
	}
	
	
	
	
}
