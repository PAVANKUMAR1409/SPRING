package com.pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 
{
	Scanner s = new Scanner(System.in);
	ArrayList<Integer> meth1()
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		System.out.println("Number of Object to enter in ArrayList 1 :");
		int n1= s.nextInt();
		System.out.println("Add "+n1+" numbers into array list 1 :");
		for(int i=0; i<n1;i++)
			al1.add(s.nextInt());
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		System.out.println("Number of Object to enter in ArrayList 2 :");
		int n2= s.nextInt();
		System.out.println("Add "+n2+" numbers into array list 1 :");
		for(int i=0; i<n2;i++)
			al1.add(s.nextInt());
		
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.addAll(al1);
		al3.addAll(al2);
		return al3;
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList3().meth1();
		System.out.println(al);
	}
	
}
