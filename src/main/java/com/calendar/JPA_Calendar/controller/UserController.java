package com.calendar.JPA_Calendar.controller;

import com.calendar.JPA_Calendar.domain.User;
import com.calendar.JPA_Calendar.service.UserService;
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

    // 유저 조회
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // 유저 수정
    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestParam String userId) {
        return userService.updateUserService(id, userId);
    }

    // 유저 삭제
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUserService(id);
    }

    private String userService(String userId) {
        return null;
    }

}
