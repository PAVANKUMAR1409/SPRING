package com.pavan;

import java.util.Scanner;

public class Fibonacci 
{
	Scanner scanner=new Scanner(System.in);
	
	public void Fib()
	{
		System.out.println("enter a number to start fibonacci series ");
		int numb1=scanner.nextInt(), numb2=numb1+1;
		int numb3;
		System.out.print(numb1+" "+numb2);
		for(int i=0; i<10; i++)
		{
			numb3=numb1+numb2;
			System.out.print(" "+numb3);
			numb1=numb2;
			numb2=numb3;
		}
	}
	public static void main(String[] args) 
	{
		new Fibonacci().Fib();
	}
}

