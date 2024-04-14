package com.pavan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberOfPoints
{
	public int meth(List<List<Integer>> nums) {
		//[3,6],[1,5],[4,7]
		Iterator<List<Integer>> itr=nums.iterator();
		while(itr.hasNext()) {
			List<Integer> list=(List<Integer>)itr.next();
			Iterator<Integer> it=list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		
		return 0;
	}
	public static void main(String[] args) {
		//[3,6],[1,5],[4,7]
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(3);
		l1.add(6);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(1);
		l1.add(5);
		List<Integer> l3=new ArrayList<Integer>();
		l3.add(4);
		l3.add(7);
		
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		NumberOfPoints obj=new NumberOfPoints();
		int count=obj.meth(list);
		System.out.println(count);
		
	}
}
