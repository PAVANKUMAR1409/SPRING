package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 
{
	ArrayList<Student> meth1(ArrayList<Integer> courseFees, String arr[])
	{
		System.out.println("Array List courseFee by using for loop: ");
		for(int i=0;i<courseFees.size();i++)
			System.out.print(courseFees.get(i)+" ");
		System.out.println("\n");
		
		System.out.println("String values by using for-each loop: ");
		for(String x: arr)
			System.out.print(x+" ");
		System.out.println("\n");
		
		ArrayList<Student> stu= new ArrayList<Student>();
		stu.add(new Student("Pavan"));
		stu.add(new Student("Surya"));
		stu.add(new Student("Chani"));
		return stu;
	}
	public static void main(String[] args)
	{
		ArrayList2 aobj = new ArrayList2();
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(1000);
		al.add(2000);
		al.add(3000);
		ArrayList<Student> als=aobj.meth1(al, new String[] {"Java","HTML","Oracle"});
		Iterator<Student> i = als.iterator();
		System.out.println("Array List Student by using Iterator Interface : ");
		while(i.hasNext())
			System.out.print(i.next()+" ");
		
	}
}
class Student
{
	private String sname;
	
	public Student(String sname)
	{
		this.sname=sname;
	}
	@Override
	public String toString()
	{
		return sname;
	}
}
