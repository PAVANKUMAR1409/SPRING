package com.pavan;

public interface A_Interface 
{
	private void meth1()
	{
		System.out.println("private Meth1 called from A_Interface");
	}
	default void meth2()
	{
		meth1();
		System.out.println("default Meth2 called ");
	}
}
