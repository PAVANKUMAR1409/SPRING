package com.pack1;

public class count 
{
	void meth(int num1, int num2)
	{
		int count=0;
		for(int x=1;x<=num2;x++)
		{
			if(x%2==0)
			{
				System.out.println(x+" is even");
				count++;
			}
		}
		System.out.println("there are "+count+" even numbers between "+num1+" and "+num2);
	}
	public static void main(String[] args)
	{
		new count().meth(1,20);
	}
}
