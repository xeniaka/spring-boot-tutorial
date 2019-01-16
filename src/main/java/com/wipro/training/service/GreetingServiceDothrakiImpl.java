package com.wipro.training.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default", "dothraki"})
public class GreetingServiceDothrakiImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "M'athchomaroon";
    }
}
