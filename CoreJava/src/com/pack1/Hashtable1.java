package com.pack1;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashtable1 
{
	void meth1()
	{
		System.out.println("Implementing TreeMap");
		Hashtable<Object, Object> ht= new Hashtable<Object,Object>();
		ht.put(101, "Java");  // Insertion order is Not Maintained
		ht.put(106,1000); //Heterogeneous Keys and Values are  Allowed
		ht.put(104,"Spring"); // null keys are not allowed & null keys are  not allowed 
		ht.put("java", 2000);  //Duplicate values are allowed 
		ht.put(103, "Html");// it is available from JAVA 1.0V[Legacy Class]
		ht.put('P', "CSS");//Its default capacity is 11 [Load Factor 0.75]
		ht.put(true,"Oracle");//its size increase by DOUBLE
		ht.put(102, "Html"); // it is synchronized
		System.out.println(ht+"\n");
		
		System.out.println("Retriving the keys and values");
		ArrayList<Object> ts= new ArrayList<Object>(ht.entrySet());
		Iterator<Object> i= ts.iterator();
		while(i.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Entry e= (Entry)i.next();
			System.out.println(e.getKey());
		}
			
		
	}
	public static void main(String[] args) {
		new Hashtable1().meth1();
	}
}
