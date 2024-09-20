package com.github.bank.controller.sign;

import com.github.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class signUpController {
    private final UserService userService;

    @GetMapping("/sign-up")
    public String getSignUp() {
        return "signUp";
    }

    @PostMapping("/signUp")
    String SignUp(@RequestParam Map<String,String> formData){
        userService.saveID(formData);
        return "redirect:/";
    }
}
