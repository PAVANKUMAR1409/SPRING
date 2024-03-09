package com.pack1;

public class asmd 
{
	void add()
	{
		int x=25, y=14;
		System.out.println("addition:"+(x+y));
	}
	void sub()
	{
		int x=100, y=10;
		System.out.println("substraction:"+(x-y));
	}
	void mul()
	{
		int x=9, y=8;
		System.out.println("multiplication:"+(x*y));
	}
	void div()
	{
		int x=100, y=25;
		System.out.println("Division:"+(x/y));
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		asmd pobj=new asmd();
		pobj.add();
		pobj.sub();
		pobj.mul();
		pobj.div();
		System.out.println("End");
	}
}
