package com.pavan;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElement 
{
	public int removeElement(int[] nums, Integer val) 
    {
		//nums = [3,2,2,3], val = 3
		long count=0;
		IntStream s=  Arrays.stream(nums).filter(element->element!=val);
		count=s.count();
        return (int) count;
    }
	public static void main(String[] args) {
		RemoveElement re= new RemoveElement();
		int [] nums= {3,2,2,3};
		Integer val=3;
		System.out.println(re.removeElement(nums, val));
	}
}
