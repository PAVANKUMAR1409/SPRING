package com.pack1;

import java.util.Arrays;

public class Array2 
{
	public int[] makeEnds(int[] nums)
	{
	   int arr[]= {nums[0],nums[nums.length-1]};     
	   return arr;
	}
	public static void main(String[] args) 
	{
		Array2 aobj=new Array2();
		int input[]= {7,4,6,2};
		int result[]=aobj.makeEnds(input);
		System.out.println(Arrays.toString(result));
	}
}
