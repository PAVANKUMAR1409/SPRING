package com.pack1;

public class Factorial 
{
	void meth(int num)
	{
		int fact=1;
		for(int x=1;x<=num;x++)
		{
			fact*=x; //fact=fact*x
		}
		System.out.println("factotial of "+num+" is "+fact);
		
	}
	public static void main(String[] args) 
	{
		new Factorial().meth(5);
	}
}
