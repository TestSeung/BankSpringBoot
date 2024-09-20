package com.github.bank.controller.sign;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class signUp {
    @GetMapping("/sign-up")
    public String getSignUp() {
        return "signUp";
    }

}
