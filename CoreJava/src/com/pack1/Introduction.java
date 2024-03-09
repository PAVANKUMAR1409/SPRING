package com.pack1;

public interface Introduction
{
	void meth1();
	
	int x=10; //public static final variable
	default void meth2()
	{
		System.out.println("interface A default method");
		// System.out.println(x++); C.E becoz final variable are CONSTANTS
		this.meth1();
		this.meth4();
	}
	static void meth3()
	{
		System.out.println("interface A static method ");
	}
	private void meth4()
	{
		System.out.println("interface A private method");
	}
	public static void main(String[] args)
	{
		System.out.println("interface A main()");
		Introduction.meth3();
	}
}
interface A
{
	void msg();
}
class Hai
{
	void display()
	{
		System.out.println("Java is Awesome");
	}
}

class Classinterface extends Hai implements Introduction,A
{
	public void meth1()
	{
		System.out.println("Interface meth1()");
	}
	public void msg()
	{
		System.out.println("Interface msg()");
	}
	public static void main(String[] args) 
	{
		Introduction aobj=new Classinterface();
		aobj.meth1();
		aobj.meth2();
		// aobj.meth4();  C.E becoz it is private method
		
		//aobj.msg(); C.E 
		A bobj= new Classinterface();
		bobj.msg();
		
		new Classinterface().display();
	}
}

