package org.springframework.batch.admin.sample;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class Custom {
	
	    @Scheduled(fixedDelay = 5000)
	    //@Scheduled(fixedRate = 5000)
	    public void demoServiceMethod()
	    {
	        System.out.println("Method executed at every 5 seconds. Current time is :: "+ new Date());
	    }
}
