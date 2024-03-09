package com.pack1;

import java.util.Arrays;

public class Array5 
{
	public int[] rotateLeft3(int[] nums)
	{
	      return new int[] {nums[1],nums[2],nums[0]};
	}
	public static void main(String[] args) 
	{
		Array5 aobj=new Array5();
		int input[]= {5,11,9};
		int result[]=aobj.rotateLeft3(input);
		System.out.println(Arrays.toString(result));
	}
}
