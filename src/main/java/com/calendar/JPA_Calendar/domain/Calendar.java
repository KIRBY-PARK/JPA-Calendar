package com.calendar.JPA_Calendar.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calendar {

    // 속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 불변
    private String user; // 작성 유저
    private String title; // 할일 제목
    private String content; // 할일 내용
    private int date; // 작성일
    private int revision; // 수정일

    // 생성자
    public Calendar() {
    }

    // 기능
    public void setTitle(String calendarTitle) {
        this.title = calendarTitle;
    }
}
