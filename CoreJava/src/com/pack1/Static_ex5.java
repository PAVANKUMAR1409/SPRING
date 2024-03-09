package com.pack1;

public class Static_ex5
{
	static int a=0;
	int b=0;
	Static_ex5()
	{
		a++;
		b++;
		System.out.println("Static variable :"+a);
		System.err.println("Instance variable :"+b);
	}
	void m1()
	{
		System.out.println("*** Accessing Static Variable ***");
		System.out.println(Static_ex5.a);
		System.out.println(a);
		// System.out.println(new Static_ex5().a);
	}
	public static void main(String[] args) 
	{
		new Static_ex5();
		new Static_ex5();
		new Static_ex5();
		System.out.println("###################");
		new Static_ex5().m1();
	}
}
