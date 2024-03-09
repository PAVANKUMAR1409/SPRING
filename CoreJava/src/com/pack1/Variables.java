package com.pack1;

public class Variables 
{
	int x=10; //Instance variable
	static int y=20;// Static variable
	
	int a; //for instance and static variables JVM will take default values if we did not initialize them
	int b;         // but for local we should initialize them.
	
	//static int a=25;
	// static String="PAVAN"
	// float y=10.8f;
	/* An Instance variable name and static variable name should not be same */
	
	void meth1()
	{
		int z=30; //Local Variable
		System.out.println("meth2() is called");
		
		System.out.println("instance var x:"+x); //by identifier
		System.out.println("instance var x"+new Variables().x+"\n"); //by class object
		
		System.out.println("static var y:"+y); //by identifier
		// System.out.println("static var y:"+new Variables().y); //by class object
		System.out.println("static var y:"+Variables.y+"\n"); // By class name.
		 
		System.out.println("local var z:"+z); //by identifier
	}
	void meth2()
	{
		System.out.println("meth2() is called");
		int x=2509;  // local
		int y=1408;  // local
		System.out.println("instance var x:"+new Variables().x);
		System.out.println("static var y"+Variables.y);
		//System.out.println("local var z:"+z); //local variables are  only with in that method. Compile time error.
		System.out.println("local var x:"+x);
		System.out.println("local var y:"+y);
		System.out.println("----------------------");
		System.out.println(new Variables().x+x);  //instance x+local x
		System.out.println(Variables.y+new Variables().x+y); //static y+instance x+local y.
	}
	void meth3()
	{
		System.out.println("meth3() is called");
		//int c;
		System.out.println("instance var a:"+a);
		System.out.println("static var b:"+b);
		//System.out.println("local var c:"+c); // we can not use local variables without initialize them.
		
	}
	public static void main(String[] args)
	{
		Variables obj=new Variables();
		obj.meth1();
		System.out.println("....................");
		obj.meth2();
		System.out.println("....................");
		obj.meth3();
	}
}
