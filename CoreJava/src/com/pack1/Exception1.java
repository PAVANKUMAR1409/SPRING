package com.pack1;

import java.util.*;

public class Exception1
{
	void meth1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(10);
		try {
			System.out.println("Try Block executed");
			System.out.println("Enter a number");
			System.out.println("====>"+20/sc.nextInt());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block Executed");
		}
		finally {
			System.out.println("Finally Block Executed");
			sc.close();
		}
		System.out.println(30);
	}
	public static void main(String[] args)
	{
		new Exception1().meth1();
	}
}
