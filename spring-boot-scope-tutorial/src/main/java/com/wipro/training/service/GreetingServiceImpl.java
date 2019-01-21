package com.wipro.training.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "common"})
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello(Greeting greeting) {
        return greeting.getMessage();
    }
}
