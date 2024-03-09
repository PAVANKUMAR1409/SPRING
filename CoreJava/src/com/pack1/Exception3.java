package com.pack1;

import java.io.FileInputStream;

public class Exception3
{
	int avl_amt=1000;
	void withDraw(int wd_amt)
	{
		if(avl_amt<wd_amt)
		{
			throw new ArithmeticException("Insufficient fund!!!");
		}
		else {
			System.out.println("Take your amount"+wd_amt);
		}
	}
	void fileOperations() throws Exception
	{
		System.out.println("Throws impementation");
		FileInputStream fis= new FileInputStream("File Path");
		System.out.println("Pavan is Good");
		fis.close();
	}
	public static void main(String[] args) throws Exception
	{
		Exception3 aobj=new Exception3();
		aobj.withDraw(2000);
		//aobj.fileOperations();
	}
}
