package com.pack1;

import java.util.Scanner;

public class Scan 
{
	static Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("meth1() called"+"\n");
		
		System.out.println("Enter x value");
		int x= sc.nextInt();
		System.out.println("x :"+x);
		
		System.out.println("Enter y value");
		int y= sc.nextInt();
		System.out.println("y :"+y);
		
		int z=x+y;
		System.out.println("z value:"+z);
	}
	void greeting()
	{
		System.out.println("Enter Your message");
		String msg=sc.nextLine();
		System.out.println("msg :"+msg);
	}
	int meth2()
	{
		System.out.println("meth2 called");
		System.out.println("enter a returning value of meth2()");
		return sc.nextInt();
	}
	void meth3(String name, int age)
	{
		System.out.println("Checking VOTE ELIGIBILITY");
		if(age>=18)
			System.out.println(name+"your are eligible for VOTE");
		else
		{
			System.out.println(name+"your are NOT eligible for VOTE");
			System.out.println(name+"you will be eligible after "+(18-age)+" years");
		}
	}
	public static void main(String[] args)
	{
		Scan aobj=new Scan();
		// aobj.meth1();
		// aobj.greeting();
		// System.out.println("meth2() is returning :"+aobj.meth2());
		System.out.println("Enter your name");
		// String name=aobj.sc.next(); we have to use this when the sc is instance variable
		String name=sc.next();
		System.out.println("Enter your age");
		// int age=aobj.sc.nextInt(); we have to use this when the sc is instance variable
		int age=sc.nextInt();
		aobj.meth3(name,age);
	}
}
