package com.pavan;

public class MinOperations
{
	public int meth(int [] nums,int k) {
		//{2,11,10,1,3}
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=k) {
				count++;
			}
		}
		return nums.length-count;
	}
	public static void main(String[] args) {
		int[] nums= {1,1,2,4,9};
		int k=9;
		MinOperations obj=new MinOperations();
		int count=obj.meth(nums, k);
		System.out.println(count);
	}
}
