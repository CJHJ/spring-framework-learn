package com.cjhj.didemo.controllers;

import com.cjhj.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InjectedController {

    private GreetingService greetingService;

    @Autowired          // Tell Spring to inject dependency into the controller, apparently not needed starting from Spring 4.2
    public InjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
