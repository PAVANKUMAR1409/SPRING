package com.pack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class HashSet_LinkedHashSet 
{
	void meth1()
	{
		System.out.println("Implementing SET Interface");
		//HashSet<Object> set = new HashSet<Object>();  //insertion order is NOT maintained
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();  // insertion order is maintained
		set.add(10);
		set.add("JAVA");
		set.add(null);
		set.add(10);
		set.add(false);
		set.add('P');
		set.add(25);
		System.out.println(set+"\n");
		
		System.out.println("size() : "+set.size()+"\n");
		//System.out.println("get() : "+set.get());
		
		System.out.println("Retriving the data by using for-each loop");
		for(Object o : set)
			System.out.print(o+" ");
		System.out.println("\n");
		
		System.out.println("Retriving the data by using Iterator Interface");
		Iterator<Object> i1=set.iterator();
		while(i1.hasNext())
			System.out.print(i1.next()+" ");
		System.out.println("\n");
		
		System.out.println("Retriving the data by using ListIterator Interface");
		ArrayList<Object> al= new ArrayList<Object>(set);
		ListIterator<Object> li=al.listIterator(al.size());
		while(li.hasPrevious())
			System.out.print(li.previous()+" ");
		System.out.println("\n");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("RADHA");
		al2.add("RADHA");
		al2.add("RADHA");
		
		HashSet<String> hs2=new HashSet<String>(al2);
		System.out.println("List : "+al2+"===>"+al2.size());
		System.out.println("Set : "+hs2+"===>"+hs2.size());	
	}
	public static void main(String[] args)
	{
		new HashSet_LinkedHashSet().meth1();
	}
}
