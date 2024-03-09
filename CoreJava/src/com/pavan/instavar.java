package com.pavan;

public class instavar
{
	int x=100, y=200;
	public static void main(String[] args)
	{
		//System.out.println(x);   //non-static variable x cannot be referenced from a static context
		instavar t= new instavar();
		System.out.println(t.x); // 100
		t.m1();
	}
	public void m1()
	{
		System.out.println(y); //100
	}
}
