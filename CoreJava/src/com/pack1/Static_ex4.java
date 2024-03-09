package com.pack1;

public class Static_ex4 
{
	int c;
	static int e;
	Static_ex4()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args)
	{
		int a=34;
		int b=21;
		new Static_ex4().c-=a++ + ++b;
		int d=--a + --b + new Static_ex4().c--;
		e=a + +b + new Static_ex4().c + d--;
		int f=-a + b-- + -new Static_ex4().c - d++;
		int sum=a + b + new Static_ex4().c + d + e + f;
		System.out.println("sum :"+sum);
	}
}
