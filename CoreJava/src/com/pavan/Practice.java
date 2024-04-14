package com.pavan;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice 
{
	public static void main(String[] args) {
		Arrays.spliterator(new int[] {10,20,30});
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);al.add(20);al.add(30);
		al.stream().filter(n->n%2==1);
	}
}
