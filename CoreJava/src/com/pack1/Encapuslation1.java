package com.pack1;

public class Encapuslation1
{
	private String empName;
	private int empSal;
	private int empExp;
	

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	
	public void setEmpSal(int empSal) 
	{
		this.empSal = empSal;
	}
	public void setEmpExp(int empExp)
	{
		this.empExp = empExp;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public double getEmpSal() 
	{
		if(empExp>=5)
			return empSal+(empSal*0.3);
		return empSal;
	}
	public int getEmpExp() 
	{
		return empExp;
	}
}
