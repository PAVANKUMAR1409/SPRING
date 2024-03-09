package com.pavan;

import java.util.Scanner;

public class Reverse
{
	Scanner scanner=new Scanner(System.in);
	void meth()
	{
		System.out.print("Enter a number: ");
		int numb=scanner.nextInt();
		int  y;
		while(numb!=0)
		{
			y=numb%10;  //134%10=4
			numb=numb/10;   //1345/10=134
			System.out.print(y); //5
		}
		
		
	}
	public static void main(String[] args)
	{
		new Reverse().meth();
	}
}
