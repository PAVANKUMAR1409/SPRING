package com.pavan;

import java.util.Scanner;


public class Factorial
{
	Scanner scanner=new Scanner(System.in);
	
	int fact=1;
	void meth1()
	{
		System.out.println("please enter a number ");
		int numb=scanner.nextInt();
		for(int i=1;i<=numb;i++)
		{
			fact=fact*i;
		
		}
		System.out.println("Factorial "+numb+" is " +fact);  
	}
	public static void main(String[] args) 
	{
		new Factorial().meth1();
	}
}
