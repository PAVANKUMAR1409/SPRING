package com.pack1;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist3
{
	void meth1()
	{
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("pavan");
		ll.add("Surya");
		ll.add("tej");
		System.out.println("Before : "+ll);
		Iterator<String> i=ll.iterator();
		while(i.hasNext())
		{
			String s=i.next().toString();
			if(s.contains("a") || s.contains("A"))
			{
				i.remove();
			}
		}
		System.out.println("After : "+ll);
	}
	public static void main(String[] args) 
	{
		new Linkedlist3().meth1();
	}
}
