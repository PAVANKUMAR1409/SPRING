package com.pack1;

public class Return6
{
	void meth1()
	{
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		return; //inside void method we can write return statement but it should not return any value.
	}
	int meth2()
	{
		System.out.println("meth2() is called");
		return 100;
		//System.out.println("namesthe"); //compile error : unreachable code.
	}
	int meth3(int i)
	{
		System.out.println("meth3() is called");
		System.out.println("i vale :"+i);
		System.out.println("int nd char are compatable datatype"); //Return type of a method and returning value of a method should be COMPATABLE.
		return 'A';
	}
	int meth4(int x,String s)
	{
		System.out.println("meth4() is called");
		if(x<=100)
		{
			System.out.println("s vale :"+s);
			System.out.println("if block executed");
			return 1000; //return statement is not the last statement but return statement should be the last executable statement
		}
		else
		{
			System.out.println("else block executed");
			return 2000;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("START");
		Return6 r=new Return6();
		r.meth1();
		System.out.println("..................");
		r.meth2();
		System.out.println("..................");
		System.out.println("meth3() is returning:"+r.meth3('a'));
		System.out.println("..................");
		System.out.println("meth4() is returning:"+r.meth4('a',"java"));
		System.out.println("END");
	}
}
