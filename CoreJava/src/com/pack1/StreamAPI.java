package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI 
{
	void meth1()
	{
		ArrayList<Emp1> al = new ArrayList<Emp1>();
		al.add(new Emp1("Pavan",26,50000));
		al.add(new Emp1("Surya",21,60000));
		al.add(new Emp1("Radha",27,70000));
		al.add(new Emp1("Prabath",27,5000));
		System.out.println("Before"+al);
		
		Stream<Emp1> s1=al.stream();
		Stream<Emp1> s2=s1.filter(emp->emp.getEage()>=25);
		
		Stream<Object> s3=s2.map(emp->emp.getEsalary()+(emp.getEsalary()/10));
		List<Object> li=s3.collect(Collectors.toList());	
		System.out.println("\nAfter : "+li);
	}
	public static void main(String[] args) {
		new StreamAPI().meth1();
	}
}


class Emp1
{
	@SuppressWarnings("unused")
	private String eName;
	private int eAge;
	private int eSalary;
	
	public Emp1(String eName, int eAge, int eSalary) 
	{
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}
	
	public int getEsalary() {
		return eSalary;
	}

	public int getEage() 
	{
		return eAge;
	}

	@Override
	public String toString()
	{
		return eAge+"  "+eSalary;
	}
	
	
}
