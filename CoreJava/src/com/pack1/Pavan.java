package com.pack1;

public class Pavan
{
	int a=10;
	static int b=20;
	static int add;
	static
	{
		int c=new Pavan().a++;
		--b;
		add=c+b;
		System.out.println("Static addition:"+Pavan.add+"\n");
	}
	static void meth1()
	{
		int a=10, b=30;
		if(a==b || a!=b)
		{
			System.out.println("KISAN SIR \n");
		}
		else
		{
			System.out.println("Std is PAVAN \n");
		}
	}
	String meth2(int x)
	{
		@SuppressWarnings("removal")
		Integer aobj= new Integer(x);
		System.out.println("int PDT value :"+x);
		System.out.println("Integer WCO value :"+aobj+"\n");
		return "Kisan Sir is Excellent";
	}
	Pavan()
	{
		@SuppressWarnings("removal")
		Character cobj= new Character('A');
		int i=cobj;
		System.out.println("Character WCO value :"+cobj);
		System.out.println("int PDT vale :"+i+"\n");
		return;
	}
	Pavan(int numb)
	{
		System.out.println("Implicit TypeCasting");
		long l=numb;
		System.out.println(numb);
		System.out.println(l+"\n");
		
		System.out.println("Explicit TypeCasting");
		double d=1234.5678;
		numb=(int)d;
		System.out.println("double value :"+d);
		System.out.println("int value :"+numb+"\n");
		
	}
	public static void main(String[] args)
	{
		Pavan p = new Pavan();
		Pavan.meth1();
		Pavan p2= new Pavan(2019);
		String s=p.meth2(2023);
		System.out.println("Java "+s);
		System.out.println("--------------------------");
		System.out.println("meth1 hashcode is :"+p.hashCode());
		System.out.println("meth2 hashcode is :"+p2.hashCode());
		System.out.println(p.equals(p2));
		System.out.println("getClass() of meth1 :"+p.getClass());
		System.out.println("toString() of meth2 :"+p2.getClass());
	}
}
