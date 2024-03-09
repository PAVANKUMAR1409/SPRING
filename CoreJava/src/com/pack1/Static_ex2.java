package com.pack1;
/* 
 	STATIC METHODS
 	1.we can access a static method in 3 ways 
 		1. by using Identifier name
 		2. by using Class Object 
 		3. by using Class Name.
 	2.we can access non-static variable inside a static method but with the help of its respective CLASS OBJECT.
 */

public class Static_ex2
{
	int x=10;
	static int y=20;
	void meth1()
	{
		System.out.println("instance:"+x);
		System.out.println("Static:"+y);
	}
	static void meth2()
	{
		System.out.println("Instance :"+new Static_ex2().x);
		System.out.println("Static :"+y);
	}
	public static void main(String[] args)
	{
		Static_ex2 aobj=new Static_ex2();
		aobj.meth1(); //by using class object
		// meth1();  by using Identifier [this key word ......to be discussed later]
		// Static_ex2.meth1(); by using class name [COMPILE TIME ERROR]
		
		//aobj.meth2(); // by using class object
		meth2(); // by using Identifier name
		Static_ex2.meth2(); // by using CLASS NAME [RECOMMEDED FOR STATIC METHODS] 
		
	}
}
