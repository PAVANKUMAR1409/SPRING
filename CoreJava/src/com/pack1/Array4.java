package com.pack1;

import java.util.Arrays;

public class Array4
{
	public int[] maxEnd3(int[] nums)
	{
	    if(nums[0]>nums[2])
	    	return new int[] {nums[0],nums[0],nums[0]};
	    return new int[] {nums[2],nums[2],nums[2]};
	}
	public static void main(String[] args) 
	{
		Array4 aobj=new Array4();
		int input[]= {2,11,20};
		int result[]=aobj.maxEnd3(input);
		System.out.println(Arrays.toString(result));
	}
}
