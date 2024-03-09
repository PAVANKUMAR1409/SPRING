package com.pavan;

import java.util.Scanner;

public class Prime
{
	Scanner scanner=new Scanner(System.in);
	void meth1()
	{
		int flag=0;
		System.out.print("Enter a number : ");
		int numb=scanner.nextInt();
		for(int i=2;i<numb;i++)
		{
			if(numb%i==0)
			{
				System.out.println("Not a Prime Number");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Prime Number");
	}
	public static void main(String[] args) {
		new Prime().meth1();
	}
}
