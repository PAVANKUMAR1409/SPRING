package com.pack1;  // POINTS ABOUT CONSTRUCTORS

public class Cnstr_ex3 
{
	String s_name;
	int s_id;
	String s_dept;
	
	static String company="ECLAT"; //static variable represents common properties of a class
	
	Cnstr_ex3(String name, int id, String dept)
	{
		s_name=name;
		s_id=id;
		s_dept=dept;
	}
	public static void main(String[] args)
	{
		Cnstr_ex3 aobj1=new Cnstr_ex3("PAVAN",14,"CIVIL");
		// Cnstr_ex3 aobj2=new Cnstr_ex3("PK",25,"CE");
		// Cnstr_ex3 aobj3=new Cnstr_ex3("EPK",14,"KUCET");
		
		//System.out.println(aobj1.s_name+" "+aobj1.s_id+" "+aobj1.s_dept+" "+aobj1.company);
		//System.out.println(aobj2.s_name+" "+aobj2.s_id+" "+aobj2.s_dept+" "+aobj2.company);
		//System.out.println(aobj3.s_name+" "+aobj3.s_id+" "+aobj3.s_dept+" "+aobj3.company+"\n");
		
		aobj1.s_id=9;
		// aobj3.company="TCS"; // 
		
		// System.out.println(aobj1.s_name+" "+aobj1.s_id+" "+aobj1.s_dept+" "+aobj1.company);  // 
		// System.out.println(aobj2.s_name+" "+aobj2.s_id+" "+aobj2.s_dept+" "+company);
		// System.out.println(aobj3.s_name+" "+aobj3.s_id+" "+aobj3.s_dept+" "+Cnstr_ex3.company);
	}
}