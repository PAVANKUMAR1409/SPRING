package com.pack1;

public class Selection2 
{
	@SuppressWarnings("unused")
	String meth(int a, int b, int c, int d)
	{
		if(a<=10)
		{
			System.out.println("HI");
			if((a+b)==50)
				return "HI";
			return"HELLO";
		}
		else
		{
			if(c>=a)
			{
				if(true)
					return "TUESDAY";
				return "WEDNESDAY"; //DEAD CODE
			}
			else
			{
				if(d>0)
					System.out.println(d+" is a positive number");
				else if(d<0)
					System.out.println(d+" is a negative number");
				else
					System.out.println(d+" is equal to ZERO");
				return "JAVA IS AWESOME";
			}
		}
	}
	public static void main(String[] args)
	{
		Selection2 aobj=new Selection2();
		String s=aobj.meth(15,0,10,0);
		System.out.println("meth is returning "+s);
	}
}
