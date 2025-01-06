package com.calendar.JPA_Calendar.controller;

import com.calendar.JPA_Calendar.domain.Calendar;
import com.calendar.JPA_Calendar.service.CalendarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    // 캘린더 생성
    @PostMapping("/{id}")
    public String createCalendarAPI() {
        String calendarTitle = "제목이 보이는 곳";

        String saveData = calendarService(calendarTitle);
        return saveData;
    }

    // 캘린더 조회
    @GetMapping("/{id}")
    public Calendar getCalendarById(@PathVariable Long id) {
        return calendarService.getCalendarById(id);
    }

    // 캘린더 수정
    @PutMapping("/{id}")
    public String updateCalendar(@PathVariable Long id, @RequestParam String title) {
        return calendarService.updateCalendarService(id, title);
    }

    // 캘린더 삭제
    @DeleteMapping("/{id}")
    public String deleteCalendar(@PathVariable Long id) {
        return calendarService.deleteCalendarService(id);
    }

    // 이 부분 없이 빨간줄이 떠서 추가했는데 이유를 아직 몰라서 여쭤보아야하는 부분
    private String calendarService(String calendarTitle) {
        return null;
    }
}
