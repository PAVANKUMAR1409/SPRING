package com.pack1;

public class MultiThread2 implements Runnable 
{
	public void run()
	{
		String name= Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		
		for(int i=1;i<=5;i++)
			System.out.println(name+"("+priority+") has executed run() :"+i);
	}
	public static void main(String[] args) 
	{
		MultiThread2 aobj= new MultiThread2();
		Thread t1= new Thread(aobj);
		Thread t2 = new Thread(aobj);
		
		t1.start();
		t2.start();
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
	}
}
