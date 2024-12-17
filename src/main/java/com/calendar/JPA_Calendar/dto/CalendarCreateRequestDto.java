package com.calendar.JPA_Calendar.dto;

import lombok.Getter;

@Getter
public class CalendarCreateRequestDto {
    private String name; // 작성 유저명
    private String title; // 할일 제목
    private String description; // 할일 내용
    private String date; // 작성일
    private String modify; // 수정일

}
