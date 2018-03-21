package com.sat.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Satish on 3/15/2018.
 */
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot.. Yay!";
    }
}
