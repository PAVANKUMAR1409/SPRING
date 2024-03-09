package com.pack1;

public class Array6 
{
	public int sum3(int[] nums)
	{
		return nums[0]+nums[1]+nums[2];
	}
	public static void main(String[] args)
	{
		Array6 aobj=new Array6();
		int x=aobj.sum3(new int[] {5,11,2});
		System.out.println(x);
	}
}
