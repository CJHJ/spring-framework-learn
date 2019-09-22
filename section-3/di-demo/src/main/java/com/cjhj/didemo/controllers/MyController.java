package com.cjhj.didemo.controllers;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;
import com.cjhj.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println(this.greetingService.sayGreeting());
        
        return "foo";
    }
}
