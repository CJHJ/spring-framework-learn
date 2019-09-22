package com.cjhj.didemo.controllers;

import com.cjhj.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InjectedControllerTest {

    private InjectedController injectedController;

    @Before
    public void setUp() throws Exception {
        this.injectedController = new InjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_CALVIN, injectedController.sayHello());
    }
}
