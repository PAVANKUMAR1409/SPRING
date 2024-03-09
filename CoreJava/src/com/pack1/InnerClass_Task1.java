package com.pack1;

public class InnerClass_Task1 
{
	class NestedClass
	{
		
		void meth1()
		{
			class InnerMeth1
			{
				String msg()
				{
					System.out.println("Nested Class==> 1st Method Inner Class msg()");
					return "Sir is Excellent......!";
				}
			}
			System.out.println("Kishan "+new InnerMeth1().msg());
			
			class InnerMeth2
			{
				void show()
				{
					System.out.println("Nested Class==> 2nd Method Inner Class show()");
				}
			}
			new InnerMeth2().show();
			
			class InnerMeth3
			{
				void meth1()
				{
					System.out.println("Nested Class===> 3rd Method Inner Class meth1()");
				}
			}
			new InnerMeth3().meth1();
		}
		
		void show()
		{
			System.out.println("Nested Class===> Normal show()");
		}
	}
	public static void main(String[] args) 
	{
		InnerClass_Task1.NestedClass iobj=	new InnerClass_Task1().new NestedClass();
		iobj.show();
		iobj.meth1();
		
	}
}
