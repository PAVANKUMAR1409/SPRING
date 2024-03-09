package com.pavan;

import java.util.Arrays;

public class solution
{
	public int[] countBits(int n) 
    {
        int[] arr= new int[n+1];
        int temp=0,add=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                temp=i%2;
                add+=temp;
            }
            arr[i]=add;
            
        }
        return arr;
    }
	public static void main(String[] args) {
		int arr[]=new solution().countBits(5);
		System.out.println(Arrays.toString(arr));
	}
}
