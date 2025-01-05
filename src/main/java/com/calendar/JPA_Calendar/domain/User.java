package com.calendar.JPA_Calendar.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    // 속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 불변
    private String user_id; // 유저명
    private String user_email; // 유저 이메일
    private int date; // 작성일

    // 생성자
    public User() {

    }

    // 기능
    public void setUser_id(String userId) {
        this.user_id = userId;
    }
}
