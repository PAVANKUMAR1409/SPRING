package com.pavan;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 implements Runnable
{
	static ConcurrentHashMap<Integer,String> m=new ConcurrentHashMap<Integer,String>();
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {e.printStackTrace();}
		System.out.println("Child Thread Updating Map");
		m.put(103,"radha");
	}
	public static void main(String[] args) throws InterruptedException {
		m.put(101, "pavan");
		m.put(102, "surya");
		ConcurrentHashMap1 t=new ConcurrentHashMap1();
		t.run();
		Set<Integer> s=m.keySet();
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
			Integer i1=(Integer)itr.next();
			System.out.println("Main Thread iterating and Current Entry is :"+i1+"==>"+m.get(i1));
			Thread.sleep(3000);
		}
		System.out.println(m);
		
	}
}
