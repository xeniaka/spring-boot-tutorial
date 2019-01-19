package com.wipro.training.config;

import com.wipro.training.controller.GreetingController;
import com.wipro.training.service.GreetingService;
import com.wipro.training.service.GreetingServiceCommonTongueImpl;
import com.wipro.training.service.GreetingServiceDothrakiImpl;
import com.wipro.training.service.GreetingServiceHighValyrianImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfig {

    @Bean
    @Profile({"default", "dothraki"})
    public GreetingService greetingServiceDothrakiImpl() {
        return new GreetingServiceDothrakiImpl();
    }

    @Bean
    @Profile("common")
    public GreetingService greetingServiceCommonTongueImpl() {
        return new GreetingServiceCommonTongueImpl();
    }

    @Bean
    @Profile("valyrian")
    public GreetingService greetingServiceHighValyrianImpl() {
        return new GreetingServiceHighValyrianImpl();
    }

    @Bean
    public GreetingController greetingController(GreetingService greetingService) {
        return new GreetingController(greetingService);
    }
}
