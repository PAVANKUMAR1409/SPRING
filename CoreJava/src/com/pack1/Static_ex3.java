package com.pack1;
/*
 	1. In our program if we are having a main() and a static block, 1st priority will be given to static block.
 	2. We can write ANY number of Static blocks in our program and called in defined order i.e., TOP to BOTTOM.
 	3. Final static variable we are supposed to initialize them at the time of its DECLERATION or only INSIDE A STATIC BLOCK.
 	   anywhere else if you are trying to initialize we will be getting an COMPILE TIME ERROR.
 */

public class Static_ex3 
{
	final static int x;
	static
	{
		x=50;
		System.out.println("1st Static block:"+x);
	}
	public static void main(String[] args)
	{
		System.out.println("main() called :"+x);
	}
	static
	{
		System.out.println("2nd static block:"+x);
	}
}
