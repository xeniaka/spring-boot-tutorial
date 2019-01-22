package com.wipro.training.controller;

import com.wipro.training.service.GreetingService;

public class GreetingController {

    private GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void saySomething() {
        String greeting = greetingService.sayHello();
        System.out.println(greeting);
    }
}
