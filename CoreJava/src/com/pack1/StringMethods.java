package com.pack1;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods 
{
	void meth1()
	{
		String s1="Java";
		String s2=new String("Java");
		String s3="Java";
		String s4=new String("Java");
		
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals("JAVA")); //false
		System.out.println(s1.equalsIgnoreCase("JAVA")); //true
		System.out.println(s3.equals(s1)); //true
		System.out.println("Java".equals("Java")); //true
		System.out.println(new String("Java").equals("Java"));// true
		System.out.println(s3.equals(s4)+"\n"); //true
		
		System.out.println(s1==s2); //false
		System.out.println(s2==s3); //false
		System.out.println(s1==s3); //true
		System.out.println(s2==s4);  //false
		System.out.println(s2==new String("Java")); //false
		System.out.println("Java"==s1); //true
		System.out.println("Java"=="Java"); //true
		System.out.println(new String("Java")==new String("Java"));//false
		System.out.println("Java"==new String("Java"));	//false
	}
	void meth2()
	{
		String s1="Java";
		System.out.println("s1= "+s1);
		System.out.println("concat() :"+s1.concat(" is Awesome"));
		System.out.println("s1 :"+s1);
		System.out.println("length() :"+s1.length());
		System.out.println("length() :"+s1.concat(" is awesome").length()+"\n");
		
		System.out.println("chatAt() :"+s1.charAt(0));  //J
		System.out.println("chatAt() :"+s1.charAt(s1.length()-1)); //a
		System.out.println("chatAt() :"+s1.charAt(s1.length()-2)); //v
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you gender :");
		char gender=sc.next().charAt(0);
		switch(gender)
		{
			case 'm','M':System.out.println("You are Male");
							break;
			case 'f','F':System.out.println("You are Female");
							break;
			default: System.out.println("Invalid Input");
		}
		sc.close();
		System.out.println();
		
		String s2="Java is awesome";
		System.out.println("startWith() :"+s2.startsWith(s1)); //true
		System.out.println("startWith() :"+s2.startsWith("J")); //true
		System.out.println("startWith() :"+s2.startsWith("Java")+"\n"); //true
		
		System.out.println("toLowerCase() :"+s2.toLowerCase()); //java is awesome
		System.out.println("toUpperCase() :"+s2.toUpperCase()); //JAVA IS AWESOME
		System.out.println("subString() :"+s2.substring(5,7)); //is
		System.out.println("subString() :"+s2.substring(3,9)); //a is a
		
		if(s2.substring(0,4).startsWith(s1.substring(0,2)))  //true
			System.out.println("HAI");
		else
			System.out.println("HELLO");
		System.out.println();
		
		String s3=" Hello World ";
		System.out.println("replace() :"+s3.replace('o','x')); //Hellx Wxrld
		System.out.println("s3.length() :"+s3.length()); //13
		System.out.println("trim() :"+s3.trim().length()); //11
		System.out.println("indexOf() :"+s3.indexOf('o')); //5
		System.out.println("lastIndexOf() :"+s3.lastIndexOf('o')+"\n"); //8
		
		String s4="8-Jan-2024";
		String arr1[]=s4.split("-");
		System.out.println("arr1 :"+Arrays.toString(arr1)); //[8,Jan, 2024]
		System.out.println("arr2 :"+Arrays.toString(s2.split(" "))); //[Java, is , awesome]
		System.out.println("arr3 :"+Arrays.toString(s2.split(""))+"\n"); //[J,a,v,a, ,i,s, ,a,w,e,s,o,m,e]
		
		String s5="ABCDEF";
		byte arr4[]=s5.getBytes();
		for(byte b:arr4)
		{
			//System.out.print(b+" "); //[65,66,67,68,69,70]
			System.out.print((char)b+" ");//[A,B,C,D,E,F]
		}
	}
	public static void main(String[] args) 
	{
		StringMethods obj=new StringMethods();
		//obj.meth1();
		obj.meth2();
	}
}
