package com.pack1;

public class Datatypes
{
	int i;   //  size=4byte range -2147483648 to 2147483647       1byte=8bits.
	byte b;  // size=1byte range -128 to 127
	short s; // size=2byte range -32768 to 32767
	long l;  // size=8byte range -2(63) to 2(63)-1
	
	float f; // size 4bytes
	double d; // size 8bytes
	
	char c; // size 2bytes , range 0 to 65535.
	
	boolean p; // true or false
	void meth1()
	{
		System.out.println("printing the default values of all 8 primitve data type");
		System.out.println("int i:"+i); //0
		System.out.println("byte b:"+b);//0
		System.out.println("short s:"+s);//0
		System.out.println("long l:"+l);//0
		System.out.println("float f:"+f); //0.0
		System.out.println("double d:"+d); //0.0
		System.out.println("char c:"+c); //  /u0000-NPC (NON PRINTABLE CHARACTER)
		System.out.println("boolean p:"+p); // false
	}
	void meth2()
	{
		int i1=25;
		int i2=14;
		int i3=i1+i2;
		System.out.println(i3);
		
		byte b1=100; //byte range is -128 to 127
		byte b2=25; 
		byte b3=(byte)(b2+b1); //this is EXPLICIT TYPE CASTING 
		System.out.println("b3:"+b3);
		
		float f=10.9F; // (3) so we have keep suffix 'f' or 'F'.
		System.out.println("f:"+f);
		
		long l=2147384748L; //  (2) so we have to keep suffix 'l' or 'L'.
		System.out.println("l:"+l);
	}
	public static void main(String[] args)
	{
		Datatypes aobj=new Datatypes();
		aobj.meth1();
		aobj.meth2();
	}
}


/*
 * NOTE:
 	1. All arithmetic operations on data type will give you the results either in INT or LONG.
 	2. Every number in java is by default considered as "INT DATA TYPE"
 	3. Every decimal value in Java is by default considered as "DOUBLE DATA TYPE"
 */
