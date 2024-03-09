package com.pack1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Vector2 
{
	Vector<Employee> meth1(ArrayList<Object> al)
	{
		Vector<Object> v=new Vector<Object>(al);
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		Vector<Employee> vEmp=new Vector<Employee>();
		vEmp.add(new Employee("PAVAP",101,"JAVA"));
		vEmp.add(new Employee("ANNA",102,"HTML"));
		vEmp.add(new Employee("SURYA",101,"ORACLE"));
		
		return vEmp;
	}
	public static void main(String[] args) 
	{
		Vector2 aobj= new Vector2();
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add(30);
		Vector<Employee> v2=aobj.meth1(al);
		
		int count =0;
		String rev="";
		for(int v=0;v<v2.size();v++)
		{
			String name=v2.get(v).toString();
			StringBuilder sb =new StringBuilder(name);
			rev=sb.reverse().toString();
			if(rev.equals(name))
			{
				System.out.println(rev+" and "+name+" are Palindrome");
				count++;
			}
			else
				System.out.println(name+" is not a Palindrome");
		}
		System.out.println("No. of Palindrome are "+count);
	}
}
