package de.memozone.spring.crud.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @Value("${welcome.message}")
    private String welcomeMessage;
    @GetMapping
    public String helloSpring(){
        return welcomeMessage;
    }



}
