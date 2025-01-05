package com.calendar.JPA_Calendar.service;

import com.calendar.JPA_Calendar.domain.Calendar;
import com.calendar.JPA_Calendar.repository.CalendarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalendarService {

    // 속성
    private final CalendarRepository calendarRepository;

    // 생성자
    public CalendarService(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    // 캘린더 생성
    public String createCalendarService(String calendarTitle) {
        log.info("캘린더를 생성합니다.");

        Calendar calendar = new Calendar();
        calendar.setTitle(calendarTitle);

        calendarRepository.save(calendar);
        return "캘린더 생성 완료";
    }
}
