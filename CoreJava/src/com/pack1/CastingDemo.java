package com.pack1;
/*
 1. Create a program with a class name CastingDemo.
 2. Inside main method declare variable of different data types such as Integer,double,float and long.
 3. Perform an implicit cast from Integer to double and then explicitly cast the RESULT to Float.
 4. Print the values of all variables before and after casting.
 */

public class CastingDemo 
{
	public static void main(String[] args) 
	{
		int i=10;
		double d=i;
		System.out.println("int value i="+i);
		System.out.println("double value d="+d+"\n");
		
		
		float f=130.78912f;
		byte b=(byte)f;   //[-128+(130-127-1)]==>-126
		System.out.println("float value f="+f);
		System.out.println("byte value b="+b+"\n");
		
		float f2=1234.5678912f;
		int i2=(int)f2; //1234
		System.out.println("float value f2="+f2);
		System.out.println("int value i2="+i2+"\n");
		
		long l=1234567L;
		float f3=(float)l;
		System.out.println("long value l="+l);
		System.out.println("float value f3="+f3+"\n");
		
		
		double d2=123456.1234567;
		float f4=(float)d2;
		System.out.println("double value d2="+d2);
		System.out.println("float value f4="+f4);
		
		
		
	}
}
