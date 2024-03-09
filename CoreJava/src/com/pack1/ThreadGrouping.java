package com.pack1;

public class ThreadGrouping extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		ThreadGrouping tobj= new ThreadGrouping();
		
		ThreadGroup tg= new ThreadGroup("Parent-ThreadGroup");
		
		Thread t1=new Thread(tg,tobj,"One");
		t1.start();
		
		Thread t2=new Thread(tg,tobj,"Two");
		t2.start();
		
		Thread t3=new Thread(tg,tobj,"Three");
		t3.start();
		
		System.out.println("Thread Group Name :"+tg.getName());
		System.out.println("Active Thread Count :"+tg.activeCount());
		
		tg.setMaxPriority(10);
		
	}
}
