package com.pack1;

import java.util.Scanner;

public class Booking 
{
	Scanner sc= new Scanner(System.in);
	void ticketBooking()
	{
		System.out.println("Which movie you want to watch");
		String movieName=sc.next();
		System.out.println("How many tickets you need for "+movieName);
		int numb=sc.nextInt();
		String tickets[]=new String[numb];
		System.out.println("Please enter "+tickets.length+" names");
		for(int i=0;i<tickets.length;i++)
				tickets[i]=sc.next();
		System.out.println("please select "+tickets.length+" seats");
		String seats[]=new String[tickets.length];
		for(int i=0;i<tickets.length;i++)
			seats[i]=sc.next();		
		System.out.println(tickets.length+" tickets has been booked for");
		for(int i=0;i<tickets.length;i++)
		{
			System.out.println(tickets[i]+" "+seats[i]);
		}
		
	}
	public static void main(String[] args) 
	{
		new Booking().ticketBooking();
	}
}
