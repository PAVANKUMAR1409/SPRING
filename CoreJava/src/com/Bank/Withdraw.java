package com.Bank;

import java.util.Scanner;

public class Withdraw extends Deposit
{
	
		int withdraw;
		static Scanner scanner=new Scanner(System.in);
		void withdraw()
		{
			if(balance==0)
			{
				System.out.println("Please Deposit the ammount");
				this.deposit();
			}
			System.out.println("PLEASE ENTER YOU AMOUNT TO WITHDRAW");
			withdraw= scanner.nextInt();
			if(balance>=withdraw)
			{
				balance-=withdraw;
				System.out.println("Successfully Withdrawn "+withdraw+" the amount");
				System.out.println("Your Remaining balance amount is :"+balance);
			}
			else
				System.out.println("You don't have a enough balance in your acoount");
			
		}
		public static void main(String[] args)
		{
			Withdraw obj=new Withdraw();
			//obj.deposit();
			//obj.withdraw();
			
			System.out.println("1. Deposit."+"\n"+"2. Withdraw.");
			System.out.println("Select the option");
			int select=scanner.nextInt();
			switch(select)
			{
				case 1: obj.deposit();
						break;
				case 2: obj.withdraw();
						break;
			}
		}
}

