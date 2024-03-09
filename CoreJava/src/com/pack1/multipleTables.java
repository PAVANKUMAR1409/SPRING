package com.pack1;
import java.util.Scanner;

public class multipleTables
{
	void meth1(int num1, int num2)
	{
		while(num1<=num2)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(num1+"*"+i+"="+(num1*i));
			}
			num1++;
			System.out.println("-------------------");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		multipleTables aobj=new multipleTables();
		System.out.println("Enter first number ");
		int a= sc.nextInt();
		System.out.println("Enter Second number ");
		int b= sc.nextInt();
		aobj.meth1(a,b);
		sc.close();
	}
}
