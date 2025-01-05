package com.calendar.JPA_Calendar.repository;

import com.calendar.JPA_Calendar.domain.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
    // 속성

    // 생성자

    // 기능
}
