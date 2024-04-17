package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vechile;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj03StrategyDpLooselyCoupledApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj03StrategyDpLooselyCoupledApplication.class, args);
		
		Vechile v=ctx.getBean("vechile",Vechile.class);
		v.journey("hyd", "goa");
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
