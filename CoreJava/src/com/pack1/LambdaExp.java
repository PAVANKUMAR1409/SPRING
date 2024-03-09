package com.pack1;

public class LambdaExp 
{
	void display()
	{
		System.out.println("Implementing Lambda Expression");
		
		InterfaceA x=()->System.out.println("Hello World");
		x.meth1();
		
		InterfaceB y=(int num1, int num2)->System.out.println("Add : "+(num1+num2));
		y.meth2(99,1);
		
		InterfaceC z=(int fN, int sN)->
		{
			if(fN<=10)
			{
				System.out.println("If Executed");
				return 1000;
			}
			else
			{
				System.out.println("Else Executed");
				return 999;
			}
		};
		System.out.println(z.meth3(100, 200));
		
		int result=z.meth3(2, 50);
		System.out.println(result);
		
		InterfaceC cobj=(int g, int b)->{
			System.out.println("second lambda expression");
			return g+b;
		};
		
		int result2=cobj.meth3(50, 50);
		System.out.println(result2);
	}
	public static void main(String[] args) {
		new LambdaExp().display();
	}
}


