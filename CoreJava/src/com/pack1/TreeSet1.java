package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet1 
{
	void meth1()
	{
		System.out.println("Implementing TreeSet");
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Pavan");
		ts.add("Surya");
		ts.add("Radha");
		ts.add("Prabath");
		ts.add("Java");
		ts.add("Html");
		ts.add("Oracle");
		// ts.add(null); R.E==> NullPointerException
		System.out.println(ts+"\n");
		
		System.err.println("Retriving the data by using Iterator Interface");
		Iterator<String> i1=ts.iterator();
		while(i1.hasNext())
			System.out.print(i1.next()+" ");
		System.out.println("\n");
		
		System.out.println("Retriving the data by using ListIterator Interface");
		ArrayList<String> al= new ArrayList<String>(ts);
		ListIterator<String> li= al.listIterator(al.size());
		while(li.hasPrevious())
			System.out.print(li.previous()+" ");
		System.out.println("\n");
		
		System.out.println("Retriving the data by using descendingIterator Method");
		Iterator<String> i2=ts.descendingIterator();
		while(i2.hasNext())
			System.out.print(i2.next()+" ");
		System.out.println("\n");
		
		System.out.println("*********METHODS***********");
		System.out.println("headSet() : "+ts.headSet("Radha"));
		System.out.println("tailSet() : "+ts.tailSet("Radha"));
	}
	public static void main(String[] args) {
		new TreeSet1().meth1();
	}
}
