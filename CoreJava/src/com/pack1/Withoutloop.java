package com.pack1;

public class Withoutloop 
{
	static int x=1;
	void meth()
	{
		if(x<=100)
		{
			System.out.println(x++);
			new Withoutloop().meth();
		}
	}
	public static void main(String[] args) 
	{
		Withoutloop aobj=new Withoutloop();
		aobj.meth();
	}
}
