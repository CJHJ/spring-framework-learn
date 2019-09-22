package com.cjhj.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_CALVIN = "Hello, Calvin!";

    @Override
    public String sayGreeting() {
        return HELLO_CALVIN;
    }
}
