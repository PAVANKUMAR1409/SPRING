//DependencyInjectionTest.java
package com.nt.main;

import java.util.Arrays;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.SeasonFinder;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
/*		//get Target spring bean class object from container
		Object obj= ctx.getBean("wmg");// object is referring WishGeneratorMessage class Obj
		//type casting to WishMessageGenerator class
		WishMessageGenerator generator = (WishMessageGenerator)obj;
*/
		//get Target spring bean class object from container
		WishMessageGenerator generator =ctx.getBean(WishMessageGenerator.class); //getBean(-,-) with generic
		
		//invoke b.method
		String resultMsg=generator.showWishMessage("Pavan");
		System.out.println(resultMsg);
		
		Class<WishMessageGenerator> c1=WishMessageGenerator.class;
		System.out.println("class name : "+c1.getName());
		System.out.println("super class name:"+c1.getSuperclass());
		System.out.println("method names :"+Arrays.toString(c1.getDeclaredMethods()));
		
		SeasonFinder sf= ctx.getBean(SeasonFinder.class);
		String season=sf.showMonth();
		System.out.println(season);
	
		//close the container
		ctx.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
