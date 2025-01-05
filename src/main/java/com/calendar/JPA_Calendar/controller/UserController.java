package com.calendar.JPA_Calendar.controller;

import com.calendar.JPA_Calendar.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    // 속성
    private final UserService userService;

    // 생성자
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 유저 생성
    @PostMapping
    public String createUserAPI() {
        String userId = "유저 이름";

        String saveData = userService(userId);
        return saveData;
    }

    private String userService(String userId) {
        return null;
    }

}
