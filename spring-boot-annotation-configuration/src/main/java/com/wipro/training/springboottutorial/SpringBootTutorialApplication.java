package com.wipro.training.springboottutorial;

import com.wipro.training.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wipro.training")
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootTutorialApplication.class, args);
        GreetingController controller = context.getBean(GreetingController.class);

        controller.saySomething();
    }
}

