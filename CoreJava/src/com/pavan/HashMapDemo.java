package com.pavan;

/*import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
*/
import java.util.*;

public class HashMapDemo
{
	void meth1()
	{
		HashMap<String, Integer> m= new HashMap<String, Integer>();
		m.put("Pavan", 90);
		m.put("Radha", 92);
		m.put("Prabhat", 94);
		m.put("Soumya", 99);
		System.out.println(m);  // insertion order is not preserved
		//{Pavan=90, Prabhat=94, Soumya=99, Radha=92}
		System.out.println(m.put("Pavan", 85)); // return the previous value and stores the given value 
		Set<String> s= m.keySet();
		System.out.println(s); // it gives key's in array format
		Collection<Integer> c =m.values();
		System.out.println(c);  // it gives value's in array format
		Set<?> s1= m.entrySet();
		System.out.println(s1); // gives both keys and values in array format
		// System.out.println(m); // gives both keys and values in collection format
		Iterator<?> itr= s1.iterator();
		while(itr.hasNext())
		{
			@SuppressWarnings("unchecked")
			Map.Entry<?, Integer> m1= (Map.Entry<?, Integer>)itr.next();
			System.out.println(m1.getKey()+"========"+m1.getValue());
			if(m1.getKey().equals("Pavan"))
			{
				m1.setValue(80);
			}
		}
		System.out.println(m);
	}
	public static void main(String[] args) 
	{
		HashMapDemo aobj=new HashMapDemo();
		aobj.meth1();
	}
}
