package com.pack1;

public class Cnstr_ex2 
{
	public Cnstr_ex2()
	{
		System.out.println("SUNDAY");
		Cnstr_ex2 obj=new Cnstr_ex2(10);
		System.out.println("TUESDAY");
		String s=obj.display("Challange Accepted");
		System.out.println(s);	
	}
	public Cnstr_ex2(int temp)
	{
		System.out.println("SATURDAY");
		Cnstr_ex2 aobj=new Cnstr_ex2(10,20);
		int a=aobj.meth1()+temp;
		System.out.println("--->"+(a+aobj.meth2()));
		System.out.println("MONDAY");
	}
	String display(String s)
	{
		System.out.println("In the next statement I am returning the value");
		return s;
	}
	int meth1() 
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public Cnstr_ex2(int data, int temp)
	{
		System.out.println("THRUSDAY");
		System.out.println("--->"+(data+new Cnstr_ex2("HI").meth2()-temp));
	}
	Cnstr_ex2(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		new Cnstr_ex2();
		System.out.println("OUTPUT VERIFIED");
	}
}
