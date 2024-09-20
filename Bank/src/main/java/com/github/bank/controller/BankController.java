package com.github.bank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BankController {
    @GetMapping("/")
    public String index() {
        return "은행 메인화면이다";
    }
}
