package com.pack1;

import java.util.Arrays;

public class Array3 
{
	public int[] middleWay(int[] a, int[] b)
	{
	   int arr[]= {a[1],b[1]};
	   return arr;
	}
	public static void main(String[] args) 
	{
		Array3 aobj=new Array3();
		int input[]= {1,2,3};
		int input2[]= {4,5,6};
		int result[]=aobj.middleWay(input,input2);
		System.out.println(Arrays.toString(result));
	}
}
