package com.pack1;

import java.io.FileReader;
import java.util.Scanner;

public class Exception2
{
	void meth1() 
	{
		Scanner sc=new Scanner(System.in);
		String s=null;
		System.out.println(10);
		try
		{
			System.out.println("Try Block Executed");
			System.out.println("Enter a number");
			System.out.println("====>"+20/sc.nextInt());
			System.out.println("s length : "+s.length());
			System.out.println("Java is awesome");
			
		}
		//System.out.println("HAI"); C.E
		catch(ArithmeticException e)
		{
			System.out.println("1st Catch Block Executed");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("2nd Catch Block Executed");
			e.printStackTrace();
		}
		//System.out.println("HAI"); C.E
		/*
		 catch(ArithmeticException | NullPointerException e) // java 1.7 version
		 {
		 	System.out.println("Catch Block Executed");
			e.printStackTrace();
		 } 
		 */
		finally
		{
			System.out.println("Finally Block Executed");
			sc.close();
		}
		System.out.println(30);
	}
	void meth2() throws Exception
	{
		System.out.println("Meth2() called");
		try(FileReader fr=new FileReader("FilePath"))  // 1.7 version
		{
			
		}
	}
	public static void main(String[] args) throws Exception
	{
		Exception2 aobj=new Exception2();
		//aobj.meth2();
		aobj.meth1();
	}
}

