package com.nt.test;

import com.nt.sbeans.Customer;

public class LombokTest {

	public static void main(String[] args) {
		Customer c1=new Customer(101,"pavan","hyd",78000);
		Customer c2=new Customer(101,"pavan","hyd",78000);
//		c1.setCNo(101);
//		c1.setCName("Pavan");
//		c1.setCAdd("Hyd");
//		c1.setBillAmt(10000);
		
		
		System.out.println(c1.getCNo()+"  "+c1.getCName()+" "+c1.getCAdd()
		+" "+c1.getBillAmt());
		
		System.out.println(c1.equals(c2)+"  "+(c1==c2));
		System.out.println(c1.hashCode()+"  "+c2.hashCode());
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
	}

}
