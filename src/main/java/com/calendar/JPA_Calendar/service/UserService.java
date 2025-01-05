package com.calendar.JPA_Calendar.service;

import com.calendar.JPA_Calendar.domain.User;
import com.calendar.JPA_Calendar.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    // 속성
    private final UserRepository userRepository;

    // 생성자
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 유저 생성
    public String createUserService(String userId) {
        log.info("유저를 생성합니다.");

        User user = new User();
        user.setUser_id(userId);

        userRepository.save(user);
        return "유저 생성 완료";
    }
}
