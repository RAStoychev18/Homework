package com.example.zazadachata;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class papi {
    @RequestMapping(value = "/home")
    public String home() {
        return "Welcome user";
    }

    @RequestMapping(value = "/user")
    public String user() {
        return "User: Radoslav Stoychev <br> Age: 18 <br> From: Burgas ";
    }
    @RequestMapping(value = "/about")
    public String about() {
        return "I live in Burgas, Bulgaria";
    }
    @RequestMapping(value = "/contact")
    public String contact() {
        return "radofifa042604@gmail.com";
    }
}
