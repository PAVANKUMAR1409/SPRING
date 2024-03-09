package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Linkedlist1 
{
	void meth1()
	{
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add(10);	
		ll.add("Pavan");
		ll.add(null);
		ll.add(10);
		ll.add(1);
		ll.add('s');
		ll.add(true);
		ll.add(25);
		System.out.println(ll+"\n");
		
		System.out.println("Retrieving the data by using for loop");
		for(int i=ll.size()-1;i>=0;i--)
			System.out.print(ll.get(i)+" ");
		System.out.println("\n");
		
		System.out.println("Retrieving the data by using Iterator Interface");
		Iterator<Object> i= ll.iterator();
		while(i.hasNext())
			System.out.print(i.next()+" ");
		System.out.println("\n");
		
		System.out.println("Retrieving the data by using ListIterator Interface");
		ListIterator<Object> li=ll.listIterator();
		while(li.hasNext())
			System.out.print(li.next()+" ");
		System.out.println("\n");
		
		System.out.println("Retrieving the data by using ListIterator Interface for reverse order");
		ListIterator<Object> li2=ll.listIterator(ll.size());
		while(li2.hasPrevious())
			System.out.print(li2.previous()+" ");
		System.out.println("\n");
		
		System.out.println("ArrayList : "+new ArrayList<Object>(ll));
		System.out.println("Vector : "+new Vector<Object>(ll));
		
		System.out.println("**********METHODS**************");
		
		System.out.println("getFirst() : "+ll.getFirst());
		System.out.println("getLast() : "+ll.getLast());
		System.out.println("removeFirst() : "+ll.removeFirst());
		System.out.println("removeLast() : "+ll.removeLast());	
	}
	public static void main(String[] args) {
		new Linkedlist1().meth1();
	}
}
