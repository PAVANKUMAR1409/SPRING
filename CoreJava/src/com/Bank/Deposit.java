package com.Bank;

import java.util.Scanner;

public class Deposit
{
	int balance;
	static Scanner scanner=new Scanner(System.in);
	void deposit()
	{
		System.out.println("PLEASE ENTER YOU AMOUNT TO DEPOSIT");
		balance=scanner.nextInt();
		System.out.println("Your amount "+balance+" has been deposited");
	}
}


