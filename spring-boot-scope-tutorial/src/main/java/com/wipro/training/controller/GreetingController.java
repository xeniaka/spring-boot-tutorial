package com.wipro.training.controller;

import com.wipro.training.service.Greeting;
import com.wipro.training.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void saySomething(Greeting greeting) {
        String message = greetingService.sayHello(greeting);
        System.out.println(message);
    }
}
