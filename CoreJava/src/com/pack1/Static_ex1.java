package com.pack1;
/* 
	STATIC VARIABLES
	
 	1. For static variable JVM will automatically initialize them with their default values.
 	2. Static variables will be initialized at the time of Class loading.
 	3. There will be only 1copy of static variable available throughout the program.
 */

public class Static_ex1 
{
	int a;
	static int b;
	Static_ex1()
	{
		a++;
		b++;
		System.out.println("Instance :"+a);
		System.out.println("Static :"+b);
	}
	Static_ex1(String s)
	{
		System.out.println(s);
		System.out.println("Instance :"+a);
		System.out.println("Static :"+b);
	}
	public static void main(String[] args) 
	{
		new Static_ex1();
		System.out.println("----------------");
		new Static_ex1();
		System.out.println("-----------------");
		new Static_ex1();
		System.out.println("-----------------");
		new Static_ex1("PAVAN");
	}
	
}
