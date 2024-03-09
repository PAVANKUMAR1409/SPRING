package com.pack1;

public class Radha 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=x++;  //y=10   x=11
		System.out.println(y); //10
		int z=++x;
		System.out.println(z); //12
	}
}
