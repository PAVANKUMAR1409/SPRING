package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueue1 
{
	void meth1()
	{
		System.out.println("Implemeting Queue");
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(10);
		pq.add(20);
		pq.add(14);
		pq.add(25);
		pq.add(9);
		pq.add(8);
		pq.add(69);
		pq.add(101);
		// pq.add(null);  R.E==>NullPointerException
 		System.out.println(pq+"\n");
 		
 		System.out.println("Retriving the data by using Iterator Interface");
 		Iterator<Object> i=pq.iterator();
 		while(i.hasNext())
 			System.out.print(i.next()+" ");
 		System.out.println("\n");
 		
 		System.out.println("Retriving the data by using for-each loop");
 		for(Object o:pq)
 			System.out.print(o+" ");
 		System.out.println("\n");
 		
 		System.out.println("peek() : "+pq.peek());// just return the 1st element in queue.
 		System.out.println("poll() : "+pq.poll());// remove and return the 1st element, if queue is empty it returns NULL
 		System.out.println("remove() : "+pq.remove()+"\n");// same as poll(), but if queue is empty it raise R.E==>NoSuchElementException.
 		
 		
 		System.out.println("Treeset===>"+new TreeSet<Object>(pq));
 		System.out.println("ArrayList===>"+new ArrayList<Object>(pq));
 		
		
	}
	public static void main(String[] args) {
		new PriorityQueue1().meth1();
	}
}
