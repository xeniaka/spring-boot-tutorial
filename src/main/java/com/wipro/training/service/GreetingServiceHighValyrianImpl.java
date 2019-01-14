package com.wipro.training.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("valyrian")
public class GreetingServiceHighValyrianImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Valar Morghulis";
    }
}
