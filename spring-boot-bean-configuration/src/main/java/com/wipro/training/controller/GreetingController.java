package com.wipro.training.controller;

import com.wipro.training.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void saySomething() {
        String greeting = greetingService.sayHello();
        System.out.println(greeting);
    }
}
