package com.pack1;

public class getclass
{
	public static void main(String[] args)
	{
		getclass aobj1=new getclass();
		getclass aobj2=new getclass();
		System.out.println("getClass():"+aobj1.getClass());
		System.out.println("getCLass():"+aobj2.getClass());
		System.out.println("........................");
		System.out.println("toString():"+aobj1.toString());
		System.out.println("toString():"+aobj1+"\n");
		System.out.println("toString():"+aobj2.toString());
		System.out.println("toString():"+aobj2);
	}
	
}
