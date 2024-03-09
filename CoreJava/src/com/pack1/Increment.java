package com.pack1;

public class Increment 
{
	void meth1()
	{
		int x=10;
		System.out.println("before x:"+x);
		x=x++; //x=10  x=11
		System.out.println("after x:"+x+"\n"); //10
		
		int y=20;
		System.out.println("before y:"+y);
		int z=y++; //z=20 y=21
		System.out.println("after y:"+y);//21
		System.out.println("z value :"+z+"\n");//20
		
		int i=50;
		System.out.println("before i :"+i);
		i=i++ + ++i; //i=50+52 
		System.out.println("after i:"+i+"\n");//102
		
		int k=100;
		System.out.println("before k:"+k);
		k=k++ +10; //k=100+10 k=101
		System.out.println("after k :"+k+"\n");//110
		
		int m=100;
		System.out.println("before m:"+m);
		m=++m +10; //m=101+10  m=101
		System.out.println("after m:"+m);
		
		System.out.println("sum :"+(x+y+z+i+k+m)); //10+21+20+102+110+111
	}
	public static void main(String[] args)
	{
		new Increment().meth1();
	}
}
