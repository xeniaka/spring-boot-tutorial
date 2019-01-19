package com.wipro.training;

import com.wipro.training.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBeanConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootBeanConfigurationApplication.class, args);

		GreetingController greetingController = context.getBean(GreetingController.class);
		greetingController.saySomething();
	}

}

