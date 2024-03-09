package com.pack1;

import java.util.Arrays;

public class AssignArray
{
	boolean[] meth(int x, int[] arr, String[] days)
	{
		boolean[] b= new boolean[1];
		b[0]=true;
		System.out.println(x);
		System.out.println("Array values using for loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.println("String values using for-each loop");
		for(String s:days)
		{
			System.out.print(s+" ");
		}	
		System.out.println("\n");
		return b;
	}
	public static void main(String[] args)
	{
		AssignArray obj=new AssignArray();
		int x=10;
		int arr[]=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		String[] days={"Sunday","Monday"};
		boolean[] b_arr=obj.meth(x, arr, days);
		System.out.println("returned value of meth() : "+Arrays.toString(b_arr));
	}
}

