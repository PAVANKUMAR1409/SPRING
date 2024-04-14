package com.pavan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeetCode3 
{
	 public <E> int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
	 {
		 int count=0;
		 // [[phone, blue, pixel], [computer, silver, lenovo], [phone, gold, iphone]]
		 Iterator<List<String>> it= items.iterator();
		 while(it.hasNext())
		 {
			// System.out.println(it.next());
			 Iterator<String> it2=it.next().iterator();
			 while(it2.hasNext())
			 {
				String s=it2.next();
				if(s.equals(ruleValue))
				{
				 count++;
				 break;
				}// end of if
			 }// end of 2nd while
		 }// end of 1st while
	     return count;
	 }
	 public static void main(String[] args) {
		 List<List<String>> ll= new ArrayList<List<String>>();
		 List<String> list1=new ArrayList<String>();
		 list1.add("phone");
		 list1.add("blue");
		 list1.add("pixel");
		 List<String> list2=new ArrayList<String>();
		 list2.add("computer");
		 list2.add("silver");
		 list2.add("lenovo");
		 List<String> list3=new ArrayList<String>();
		 list3.add("phone");
		 list3.add("gold");
		 list3.add("iphone");
		 
		 ll.add(list1);
		 ll.add(list2);
		 ll.add(list3);
		 String ruleKey = "color", ruleValue = "silver";
		 // System.out.println(ll);
		 int x=new LeetCode3().countMatches(ll, ruleKey, ruleValue);
		 System.out.println(x);
	}
}
