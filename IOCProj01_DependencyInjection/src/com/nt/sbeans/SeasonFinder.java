package com.nt.sbeans;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("SF")
public class SeasonFinder 
{
	@Autowired //Field Injection
	private  LocalDateTime month;
	
	//bean method 
	public  String showMonth()
	{
		// getting current month of the year
		int mon=month.getMonthValue();
		if(mon>3 && mon<=7)
			return "Summer";
		else if(mon>=8 && mon<=11)
			return "Rainy";
		else
			return "Winter";
	}
}