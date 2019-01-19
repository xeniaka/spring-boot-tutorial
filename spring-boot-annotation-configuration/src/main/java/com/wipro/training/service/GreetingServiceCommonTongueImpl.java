package com.wipro.training.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("common")
public class GreetingServiceCommonTongueImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hi";
    }
}
