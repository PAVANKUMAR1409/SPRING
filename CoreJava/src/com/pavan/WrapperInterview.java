package com.pavan;

public class WrapperInterview 
{
	public static void main(String[] args) {
		Integer i1=100;
		Integer i2=100;
		Integer i3=500;
		Integer i4=500;
		System.out.println(i3.hashCode()+"  "+i4.hashCode());
		if(i1.equals(i2))
			System.out.println(i1+" equals "+i2);
		else
			System.out.println(i1+" not equals "+i2);
		if(i3.equals(i4))
			System.out.println(i3+" equals "+i4);
		else
			System.out.println(i3+" not equals "+i4);
	}
}
