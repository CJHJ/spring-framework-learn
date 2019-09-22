package com.cjhj.didemo.controllers;

import com.cjhj.didemo.services.GreetingService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InjectedController {

    private GreetingService greetingService;

//    @Autowired          // Tell Spring to inject dependency into the controller, apparently not needed starting from Spring 4.2
    // Use @Qualifier to set which bean get wired
    public InjectedController(@Qualifier("anotherGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
