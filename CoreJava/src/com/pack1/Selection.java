package com.pack1;

public class Selection 
{
	void meth1(int i)
	{
		System.out.println("meth1 called");
		if(i==10)
		{
			System.out.println("if block executed");
			System.out.println("i value ="+i);
		}
		System.out.println("meth1 executed");
	}
	void meth2(int i)
	{
		System.out.println("meth2 called");
		if(i<=10)
			// int x=25;  we should not write any declarative statement when we are not using {}
			System.out.println("if block executed"); // When we are not using {} only statement below it is related to if(). 
			System.out.println("i value is :"+i);
			System.out.println("meth2 executed");
	}
	@SuppressWarnings("unused")
	void meth3(int i)
	{
		System.out.println("meth3 called");
		if(false)
		{
			System.out.println("if block"); // DEAD CODE
			System.out.println("i value is :"+i);  // Warring: DEAD CODE because this statements never going to execute
		}
		System.out.println("meth3 executed");
	}
	int meth4(int i)
	{
		System.out.println("meth4 called");
		if(i>=10)
			return 100;
			return 200;
			//  System.out.println(meth4 executed);  UNREACHEABLE CODE
	}
	void meth5(int i)
	{
		System.out.println("meth5 called");
		if(!(i==new Selection().meth6()))
		{
			System.out.println("if block is executed");
			System.out.println("i value ="+i);
		}
		else
		{
			System.out.println("else block is executed");
			System.out.println("i value ="+i);
		}
		System.out.println("meth5 executed");
	}
	char meth6()
	{
		System.out.println("meth6 called");
		return 'A';
	}
	void meth7(int i)
	{
		System.out.println("meth7 called");
		if(i==10)
			System.out.println("if block is executed");
			//  System.out.println("i value ="+i);  UNREACHEABLE CODE
		else
			System.out.println("if block is executed");
			System.out.println("i value ="+i);
			System.out.println("meth7 executed");
	}
	void meth8(int i)
	{
		System.out.println("meth8 called");
		if(i>0)
			System.out.println(i+" is positive number");
		else if(i<0)
			System.out.println(i+" is negative number");
		else
			System.out.println(i+"is ZERO");
		System.out.println("mryh8 executed");
	}
	void meth9(int i)
	{
		System.out.println("meth9 called");
		if((true && false) || !(i==10))
		{
			System.out.println("if block executed");
		}
		else
			System.out.println("else block executed");
		System.out.println("meth9 executed");
	}
	public static void main(String[] args)
	{
		Selection obj=new Selection();
		obj.meth1(10);
		System.out.println("--------------------------");
		obj.meth2(50);
		System.out.println("--------------------------");
		obj.meth3(100);
		System.out.println("--------------------------");
		System.out.println(obj.meth4(50));
		System.out.println("--------------------------");
		obj.meth5(100);
		System.out.println("--------------------------");
		obj.meth7(10);
		System.out.println("--------------------------");
		obj.meth8(0);
		System.out.println("--------------------------");
		obj.meth9(50);
	}
}
