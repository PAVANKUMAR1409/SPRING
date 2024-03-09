package com.pack1;

public class IncreDecre
{
	int x=50;
	void meth1()
	{
		System.out.println("before :"+x);
		x++;
		System.out.println("after increment :"+x);
		x--;
		System.out.println("after decrement :"+x);
	}
	void meth2()
	{
		System.out.println("meth2 is called");
		int i=100;
		System.out.println(i); //100 i=100
		System.out.println(i++); //100 i=101
		System.out.println(++i); //102 i=102
		
		++i; //103
		i++; //104
		System.out.println(--i); //103 x=103
		
		i--; //102
		System.out.println(i++); //102 x=103
		System.out.println(i--); //103 x=102
		System.out.println(i); //102
	}
	void meth3()
	{
		System.out.println("meth3 is called");
		int x=1;
		System.out.println(x++); //1 x=2
		System.out.println(x++); //2 x=3
		System.out.println(x++); //2 x=4
		
		x++; //x=5
		System.out.println(++x); //6 x=6
		System.out.println(x--); //6 x=5
		System.out.println(--x); //4 x=4
		System.out.println(x--); //4 x=3
		
		x--; //x=2
		System.out.println(x++ +3); //2+3=5 x=3
		System.out.println(x++); //3 x=4
		System.out.println(--x); //3 x=3
		System.out.println(x); //3 
	}
	public static void main(String[] args) 
	{
		IncreDecre aobj=new IncreDecre();
		aobj.meth1();
		System.out.println("--------------");
		aobj.meth2();
		System.out.println("---------------");
		aobj.meth3();
		
	}
}
