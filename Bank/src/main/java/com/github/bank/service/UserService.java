package com.github.bank.service;

import com.github.bank.repository.user.User;
import com.github.bank.repository.user.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserJpaRepository userJpaRepository;
    private final PasswordEncoder passwordEncoder;

    public void saveID(Map<String, String> formData) {
        String name = formData.get("name");
        String ID = formData.get("ID");
        String password = formData.get("password");
        log.info(passwordEncoder.encode(password));

        User user = User.builder()
                .username(name)
                .userId(ID)
                .password(passwordEncoder.encode(password))
                .bankType("미구현")
                .build();
        userJpaRepository.save(user);
    }
}
