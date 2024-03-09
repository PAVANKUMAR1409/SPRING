package com.pack1;

import java.util.LinkedHashMap;
import com.pavan.Fibonacci;

public class MethodReferenc 
{
	void display()
	{
		System.out.println("Implementing Method References");
		
		Interface1 aobj1=new MethRef2()::show;  // non static method referencing
		Interface1 aobj2=MethRef2::msg;
		aobj1.meth1(); 
		aobj2.meth1();
		
		Interface2 bobj=this::show;
		bobj.meth2(100);
		
		
		//Interface1 aobj3=()->new Fibonacci().Fib();
		Interface1 aobj3=new Fibonacci()::Fib;
		aobj3.meth1();
		
		
		Interface1 aobj4=MethRef2::new;
		aobj4.meth1();
		
		Interface2 bobj2=MethRef2::new;
		bobj2.meth2(30);
		
	}
	void show(int i)
	{
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("Java", 101);
		map.put("Oracle", 102);
		map.put("HTML", 103);
		map.put("CSS", 104);
		System.out.println("\n"+map+" "+i+"\n");
	}
	public static void main(String[] args) {
		new MethodReferenc().display();
	}
}




class MethRef2
{
	void show()
	{
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("Java", 101);
		map.put("Oracle", 102);
		map.put("HTML", 103);
		map.put("CSS", 104);
		System.out.println(map);
	}
	static void msg()
	{
		System.out.println("\nThis is msg() overridding interface1");
	}
	public MethRef2()
	{
		System.out.println("\nConstructor Referencing");
	}
	public MethRef2(int name)
	{
		System.out.println(name);
	}
}


@FunctionalInterface
interface Interface1
{
	void meth1();
}

@FunctionalInterface
interface Interface2
{
	void meth2(int x);
}

