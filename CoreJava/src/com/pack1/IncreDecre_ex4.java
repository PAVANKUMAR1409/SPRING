package com.pack1;

public class IncreDecre_ex4 
{
	public static void main(String[] args) 
	{
		int a=34, b=21;
		int c=a++ + ++b;
		int d= --a + --b + c--;
		int e=a + +b + +c + d--;
		int f=-a + b-- + -c - d++;
		int sum=a+b+c+d+e+f;
		System.out.println("sum ="+sum);
	}
}
