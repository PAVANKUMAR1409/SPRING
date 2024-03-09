package com.pack1;

public class DeadLock 
{
	public static void main(String[] args) 
	{
		final String A= "JAVA";
		final String B="PHYTHON";
		Thread t1=new Thread() 
		{ // Anonymous inner Class
			public void run()
			{
				synchronized(A) //Thread1 is holding JAVA
				{
					System.out.println("Thread 1 Locked on A");
					try
					{
						Thread.sleep(100);						
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(B)
					{
						System.out.println("Thread 1 Locked On B");
					}
				}
				System.out.println("No Dead Lock");
			}
			
		};//Anonymous inner class ended.
		Thread t2=new Thread() 
		{//anonymous inner class
			public void run()
			{
				synchronized(B) //Thread 2 is holding PHYTHON
				{
					System.out.println("Thread 2 Locked on B");
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						e.printStackTrace();
					}
					synchronized(A) //Thread 2 is holding JAVA
					{
						System.out.println("Thread 2 locked on A");
					}
				}
				System.out.println("no Dead Lock");
			}
		};//anonymous inner class ends.
		t1.start();
		t2.start();
	}
}
