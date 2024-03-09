package com.pack1;

public class Loops
{
	void meth(int a,int b, int x)
	{
		if(a==1)
		{
			if(b==5)
			{
				System.out.println("b value:"+b);
			}
			else{
				switch(x)
				{
					case 3:while(a<=2)
							{
								do
								{
									for(int i=0;i<=3;i++)
									{
										System.out.println("i value :"+i);
									}
									System.out.println("\n");
									b++;
								}while(b<=5);
								a++;
							}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		new Loops().meth(1,4,3);
	}
}

