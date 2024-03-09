package com.pavan;

import java.io.*;

public class FileDemo 
{
		public static void main(String[] args)
		{
			int count=0;
			File f= new File("E:\\Aee General");
			String[] s=f.list();
			for(String s1:s)
			{
				count++;
				System.out.println(s1);
			}
			System.out.println("the total number of files is : "+count);
		}
}
