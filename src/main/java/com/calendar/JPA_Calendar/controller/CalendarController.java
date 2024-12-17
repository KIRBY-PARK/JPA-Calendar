package com.calendar.JPA_Calendar.controller;

import com.calendar.JPA_Calendar.service.CalendarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/calendar")
public class CalendarController {
   // 속성
    private final CalendarService calendarService;

   // 생성자
    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

   // 기능
    public void createCalendarAPI(){

    }
}
