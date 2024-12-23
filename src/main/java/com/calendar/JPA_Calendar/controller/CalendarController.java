package com.calendar.JPA_Calendar.controller;

import com.calendar.JPA_Calendar.dto.CalendarCreateRequestDto;
import com.calendar.JPA_Calendar.service.CalendarService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: 초기화 작업 실행");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("@PreDestroy: 소멸 작업 실행");
    }
    
    public void createCalendarAPI(@RequestBody CalendarCreateRequestDto calendarCreateRequestDto) {
        String name = calendarCreateRequestDto.getName();
        String title = calendarCreateRequestDto.getTitle();
        String description = calendarCreateRequestDto.getDescription();
        String date = calendarCreateRequestDto.getDate();
        String modify = calendarCreateRequestDto.getModify();

        log.info("Create calendar : {}", name);
        log.info("Create calendar : {}", title);
        log.info("Create calendar : {}", description);
        log.info("Create calendar : {}", date);
        log.info("Create calendar : {}", modify);
    }
}
