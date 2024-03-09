package com.pack1;

public class InnerClass_Task2 
{
	class NestedClass
	{
		void msg()
		{
			System.out.println("msg() from Nested Inner Class");
		}
	}
	void meth1()
	{
		class MethClass{
			void msg()
			{
				System.out.println("msg() from Method Local Inner Class");
			}
		}
		new MethClass().msg();
	}
	static class Static_Class{
		void msg()
		{
			System.out.println("msg() from Static Inner Class");
		}
	}
	public static void main(String[] args) {
		InnerClass_Task2.NestedClass iobj=new InnerClass_Task2().new NestedClass();
		iobj.msg();
		new InnerClass_Task2().meth1();
		InnerClass_Task2.Static_Class obj=new InnerClass_Task2.Static_Class();
		obj.msg();
	}
}
