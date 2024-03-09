package com.pack1;

public class Task_1 
{
	int a=10;
	public String testmethod()
	{
		new Task_1(100,200,"PAVAN");
		System.out.println(40);
		return new Task_1().testmethod3(new Task_1(50).testmethod2())+new Task_1().testmethod4("HAI");
	}
	Task_1()
	{
		System.out.println("HAI");
	}
	public int testmethod2()
	{
		System.out.println("50");
		return 15+25;
	}
	Task_1(int a)
	{
		System.out.println("PAVAN IS GOOD BOY");
	}
	public String testmethod3(int a)
	{
		System.out.println(18);
		return "IS";
	}
	Task_1(int a, int b, String s)
	{
		System.out.println(a+b);
		System.out.println(s);
	}
	public String testmethod4(String s)
	{
		System.out.println(88);
		return "GOOD";
	}
	public static void main(String[] args)
	{
		Task_1 t1=new Task_1();
		t1.a=10;
		Task_1 t2=new Task_1(50);
		t2.a=30;
		System.out.println("JAVA "+t1.testmethod()+" "+(t1.a+t2.a-30));
	}
	
}
