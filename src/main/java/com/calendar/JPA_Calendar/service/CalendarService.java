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

    // 캘린더 조회
    public Calendar getCalendarById(Long id) {
        return calendarRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("캘린더를 찾을 수 없습니다."));
    }

    // 캘린더 수정
    public String updateCalendarService(Long id, String title) {
        Calendar calendar = calendarRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("캘린더를 찾을 수 없습니다."));
        calendar.setTitle(title);
        calendarRepository.save(calendar);
        return "캘린더 수정 완료";
    }

    // 캘린더 삭제
    public String deleteCalendarService(Long id) {
        calendarRepository.deleteById(id);
        return "캘린더 삭제 완료";
    }
}
