package com.pack1;

import java.util.Scanner;

public class Encapmain
{
		void meth1()
		{
		Scanner sc=new Scanner(System.in);
		Encapuslation1 aobj=new Encapuslation1();
		
		System.out.println("Enter your name");
		aobj.setEmpName(sc.next());
		
		System.out.println("Enter your salary");
		aobj.setEmpSal(sc.nextInt());
		
		System.out.println("Enter your Experience");
		aobj.setEmpExp(sc.nextInt());
		
		System.out.println("Employee name : "+aobj.getEmpName());
		System.out.println("Employee name : "+aobj.getEmpSal());
		System.out.println("Employee name : "+aobj.getEmpExp());
		
		sc.close();
		}
		public static void main(String[] args)
		{
			new Encapmain().meth1();
		}
}
