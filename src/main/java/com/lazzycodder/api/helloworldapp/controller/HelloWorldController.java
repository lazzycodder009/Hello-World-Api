package com.lazzycodder.api.helloworldapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String greeting(){
        return "Hello World Greeting!!";
    }

}
