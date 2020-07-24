package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
	
	@Scheduled(cron="1 * * * * *")
	public void sc() {
		System.out.println("schdules");
		
	}

	@Scheduled(cron="2 * * * * *")
	public void scone() {
		System.out.println("schdules two");
		
	}
}
