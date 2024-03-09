package com.pack1;

import java.util.Scanner;

public class AssigScan 
{
	static Scanner sc= new Scanner(System.in);
	void employe()
	{
		System.out.println("Enter employe name");
		String name=sc.next();
		System.out.println("Enter employe id");
		int id=sc.nextInt();
		System.out.println("Enter employe dept");
		String dept=sc.next();
		System.out.print("Enter employe address");
		String address=sc.nextLine();
		
		System.out.println("---------------------");
		
		System.out.println("empName : "+name);
		System.out.println("empId : "+id);
		System.out.println("empDept : "+dept);
		System.out.println("empAddress : "+address);
	}
	public static void main(String[] args) 
	{
		new AssigScan().employe();
	}
}
