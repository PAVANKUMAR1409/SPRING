package com.pack1;

public class final_ize 
{
	void meth()
	{
		System.out.println("hi");
	}
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args) 
	{
		final_ize aobj1=new final_ize();
		//final_ize aobj2=new final_ize();
		aobj1.meth();
		aobj1=null;
		System.gc();
	}
	
}
