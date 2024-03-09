package com.pack1;

public class Cnstr_ex 
{
	void meth1()
	{
		new Cnstr_ex("HELLO");
		System.out.println("meth1 is called");
	}
	void meth2()
	{
		System.out.println("meth2 is called");
		new Cnstr_ex("Pavan is Good");
	}
	Cnstr_ex()
	{
		System.out.println("Non parameterized constructor is called");
		new Cnstr_ex(1000).meth2();
	}
	Cnstr_ex(int x)
	{
		System.out.println("Parameterized constructor is called:"+x);
		new Cnstr_ex("hi");
	}
	Cnstr_ex(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Cnstr_ex aobj=new Cnstr_ex();
		aobj.meth1();
	}
}
