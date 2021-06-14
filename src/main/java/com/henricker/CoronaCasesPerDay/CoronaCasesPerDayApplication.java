package com.henricker.CoronaCasesPerDay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaCasesPerDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaCasesPerDayApplication.class, args);
	}

}
