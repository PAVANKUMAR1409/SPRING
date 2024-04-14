package com.pavan;

import java.util.Arrays;

public class DecompressRLElist
{
	public int[] meth(int[] nums) {
		int n=0;
		int[] arr1= new int[nums[0]];//length=1
		int[] arr2=new int[nums[2]];//length=3
		int[] num=new int[arr1.length+arr2.length];
		while(n<nums.length) {
			
			for(int i=0;i<=arr1.length-1;i++) {
				arr1[i]=nums[i+1];
			}
			
			for(int i=0;i<=arr2.length-1;i++) {
				arr2[i]=nums[nums.length-1];
			}		
			
			num[0]=arr1[0];
			for(int i=0;i<num.length-1;i++) {
				num[i+1]=arr2[i];
			}
			n+=2;
		}
		return num;
	}
	public static void main(String[] args) {
		int nums[]= {42,39};
		DecompressRLElist obj=new DecompressRLElist();
		int arr[]=obj.meth(nums);
		System.out.println(Arrays.toString(arr));
	}
}
