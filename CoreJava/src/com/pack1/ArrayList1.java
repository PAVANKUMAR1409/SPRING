package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 
{
	void meth1()
	{
		System.out.println("IMPLEMENTING ARRYALIST");
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(10);
		al.add(35);
		al.add(null);
		al.add(40);
		al.add(59);
		al.add(9);
		System.out.println(al);
		
		System.out.println("size() : "+al.size());
		System.out.println("get() : "+al.get(5));
		System.out.println("get() : "+al.get(al.size()-1));
		
		System.out.println("Retrieving the data by for loop");
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+"  ");
		System.out.println("\n");
		for(int i=al.size()-1;i>=0;i--)
			System.out.print(al.get(i)+"  ");
		System.out.println("\n");
		
		System.out.println("Retrieving the data by for-each loop");
		for(Object o:al)
			System.out.print(o+"  ");
		System.out.println("\n");
		
		System.out.println("Retrieving the data by Iterator Interface");
		Iterator<Integer> i= al.iterator();
		while(i.hasNext())
			System.out.print(i.next()+"  ");
		System.out.println("\n");

		System.out.println("*********METHODS**********");
		System.out.println(al);
		al.add(2,100);
		System.out.println(al+"\n");
		
		System.out.println("isEmpty() : "+al.isEmpty());
		//al.clear();
		//System.out.println("isEmpty() : "+al.isEmpty());
		System.out.println("contains() : "+al.contains(59)+"\n");
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(59);
		al2.add(14);
		System.out.println("containsAll() : "+al.containsAll(al2));
		System.out.println("Before : "+al);
		al.addAll(al2);
		System.out.println("After : "+al+"\n");
		
		System.out.println("remove() : "+al.remove((Object)59)); // return boolean and remove the object
		System.out.println(al+"\n");
		System.out.println("remove() : "+al.remove(3)); // return the value and remove it.
		System.out.println(al+"\n");
		//System.out.println("removeAll() : "+al.removeAll(al2));
		//System.out.println(al+"\n");
		
		System.out.println("retainAll() : "+al.retainAll(al2));
		System.out.println(al);
		
	}
	public static void main(String[] args)
	{
		new ArrayList1().meth1();
	}
}
