package com.pack1;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap1 
{
	void meth1()
	{
		System.out.println("Implementing TreeMap");
		TreeMap<Object, Object> tm= new TreeMap<Object,Object>();
		tm.put(101, "Java");  // Insertion order is Not Maintained but sorting order of keys are maintanied
		tm.put(106,1000); //Heterogenous Keys are not allowed And Values are  Allowed
		tm.put(100,null); // null keys are not allowed but null keys are allowed
		tm.put(105, 2000);  //Dupilacte values are allowed
		tm.put(103, "Html");// it is available from JAVA 1.2V
		tm.put(107, "CSS");//Its default capacity is 16 [Load Factor 0.75]
		tm.put(104,"Oracle");//its size increase by DOUBLE
		tm.put(102, "Html"); // it is NOT synchronized
		System.out.println(tm+"\n");
		
		System.out.println("get() : "+tm.get(103));
		System.out.println("Retriving all the keys in descending order");
		TreeSet<Object> ts=new TreeSet<Object>(tm.keySet());
		Iterator<Object> i=ts.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("Retriving Keys and Values from the TreeMap");
		ArrayList<Object> al = new ArrayList<Object>(tm.entrySet());
		Iterator<Object> i1=al.iterator();
		while(i1.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Entry e= (Entry)i1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		TreeMap1 obj = new TreeMap1();
		obj.meth1();
	}
}
