package com.pack1;

public class InheritAssign1 extends InheritAssign
{
	void display()
	{
		System.out.println("HI");
		super.meth4();
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a + a++;
	}
	@SuppressWarnings("unused")
	InheritAssign1()
	{
		this(show(50));
		for(int i=1;;i++)
		{
			super.meth4();
			break;
		}
		System.out.println("HI");
		System.out.println(show(50));
	}
	InheritAssign1(int a)
	{
		System.out.println("===>"+ (a++ + show(50)));
	}
	public static void main(String[] args) 
	{
		new InheritAssign1().display();
	}
}
