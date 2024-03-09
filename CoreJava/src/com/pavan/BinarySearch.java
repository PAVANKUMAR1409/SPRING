package com.pavan;

public class BinarySearch 
{
	public int meth1(int[] arr, int target)
	{
		int left=0, right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				left=mid+1;
			else
				right=mid-1;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		BinarySearch obj=new BinarySearch();
		int[] arr= {10,20,30,40,50,60};
		int result=obj.meth1(arr, 40);
		System.out.println("index position is  "+result);
	}
}
