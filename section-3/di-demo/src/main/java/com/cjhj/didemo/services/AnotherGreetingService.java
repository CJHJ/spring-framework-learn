package com.cjhj.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class AnotherGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Yet another greeting from new service!";
    }
}
