package com.calendar.JPA_Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJpaAuditing
@SpringBootApplication
public class JpaCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCalendarApplication.class, args);
	}

}
