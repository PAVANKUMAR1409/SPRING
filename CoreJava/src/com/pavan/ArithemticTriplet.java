package com.pavan;

public class ArithemticTriplet 
{
	
	public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
		//0,1,4,6,7,10
		for(int i=0;i<nums.length-2;i=i+1)
		{
			if((nums[i+1]-nums[i])==diff || (nums[i+2]-nums[i+1])==diff) {count++;}
			 
		}
		return count;
    }
	public static void main(String[] args) {
		int[] nums= {0,1,4,6,7,10};
		int diff=3;
		int x=new ArithemticTriplet().arithmeticTriplets(nums, diff);
		System.out.println(x);
	}
}
