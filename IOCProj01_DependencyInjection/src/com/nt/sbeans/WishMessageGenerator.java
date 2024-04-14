//WishMessageGenerator
package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired //Field Injection
	private LocalDateTime dateTime;  //HAS-A-PROPERTY
	
	//b.method having b.logic
	public String showWishMessage(String user)
	{
		//get current hour of the day 
		int hour=dateTime.getHour();
		
		//generate the wish message
		if(hour<12)
			return "GoodMorning "+user;
		else if(hour<16)
			return "GoodAfternoon "+user;
		else if(hour<20)
			return "GoodEvening "+user;
		else
			return "GoodNight "+user;
	}
}
