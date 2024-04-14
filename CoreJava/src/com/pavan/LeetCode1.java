package com.pavan;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1 
{
	public static void main(String[] args) {
		//nums = [0,1,2,3,4], index = [0,1,2,2,1]
		int[] nums= {0,1,2,3,4};
		int[] index= {0,1,2,2,1};
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0;i<index.length;i++)
		{
			al.add(index[i],nums[i]);
		}
		//System.out.println(al);
		
		int[] arr=new int[nums.length];
		for(int k=0;k<nums.length;k++)
		{
			arr[k]=al.get(k);
		}
		System.out.println(Arrays.toString(arr));
	}
}
