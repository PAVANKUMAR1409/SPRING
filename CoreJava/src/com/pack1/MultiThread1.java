package com.pack1;

public class MultiThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("run() executed :"+i);
	}
	public static void main(String[] args) 
	{
		MultiThread1 aobj =new MultiThread1();
		Thread t1 =new Thread(aobj);
		
		t1.start();
		// t1.run();
		
		@SuppressWarnings("unused")
		Thread t2= new Thread();
		// t2.start();
		// t2.run();
	}
}
