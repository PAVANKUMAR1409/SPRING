package com.pack1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorPractice 
{
	void meth1()
	{
		Vector<Object> v= new Vector<Object>();
		v.add(10);
		v.add("JAVA");
		v.add(null);
		v.add(10);
		v.add('P');
		v.add(true);
		v.add(25);
		v.add(100);
		System.out.println(v+"\n");
		
		System.out.println("get() : "+v.get(4));
		System.out.println("sixe() : "+v.size());
		System.out.println("capacity() : "+v.capacity());
		
		v.add(v.size()-1, 200);
		System.out.println(v);
		
		v.set(v.size()-1, 500);
		System.out.println(v);
		
		v.add(2,"oracle");
		v.add(1000);
		System.out.println(v);
		System.out.println("sixe() : "+v.size());
		System.out.println("capacity() : "+v.capacity());
		
		System.out.println("Retrieving data from Vector by using for loop");
		for(int i=0;i<v.size();i++)
			System.out.print(v.get(i)+" ");
		System.out.println();
		for(int i=v.size()-1;i>=0;i--)
			System.out.print(v.get(i)+" ");
		System.out.println("\n");
		
		System.out.println("Retrieving data from Vector by using for-each loop");
		for(Object o:v)
			System.out.print(o+" ");
		System.out.println("\n");
		
		System.out.println("Retrieving data from Vector by using Iterator Interface");
		Iterator<Object> i= v.iterator();
		while(i.hasNext())
			System.out.print(i.next()+" ");
		System.out.println("\n");
		
		System.out.println("Retrieving data from Vector by using Enumeration Interface");
		Enumeration<Object> e =v.elements();
		while(e.hasMoreElements())
			System.out.print(e.nextElement()+" ");
		System.out.println("\n");
		
		Scanner s= new Scanner(System.in);
		ArrayList<Object> al = new ArrayList<Object>();
		for(int j=1;j<=5;j++)
			al.add(s.nextInt());
		System.out.println("ArrayList : "+al);
		s.close();
		
		// v.add(al);   // by this elements in ArrayList will add as a single array in vector
		v.addAll(al);
		System.out.println(v);
		
		Vector<Object> v2= new Vector<Object>(al);
		System.out.println(v2);
	}
	void meth2(Vector<Student1> stu)
	{
		System.out.println("meth2 calling===>parameter as vector");
		Iterator<Student1> i=stu.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		VectorPractice obj = new VectorPractice();
		//obj.meth1();
		
		Vector<Student1> stuVector=new Vector<Student1>();
		
		Student1 s1=new Student1("pavan");
		Student1 s2=new Student1("surya");
		Student1 s3=new Student1("radha");
		
		stuVector.add(s1);
		stuVector.add(s2);
		stuVector.add(s3);
		
		obj.meth2(stuVector);
	}
}
class Student1
{
private String sname;
	
	public Student1(String sname)
	{
		this.sname=sname;
	}
	@Override
	public String toString()
	{
		return sname;
	}
}
