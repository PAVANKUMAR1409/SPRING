package com.pack1;

import java.util.Arrays;

public class Array1 
{
	public int[] makeLast(int[] nums)
	{
	    int arr[]=new int [2*nums.length];
	    arr[arr.length-1]=nums[nums.length-1];
	    return arr;
	}
	public static void main(String[] args) 
	{
		Array1 aobj= new Array1();
		int input[]= {1,2,6};
		int result[]=aobj.makeLast(input);
		System.out.println(Arrays.toString(result));
	}
}
