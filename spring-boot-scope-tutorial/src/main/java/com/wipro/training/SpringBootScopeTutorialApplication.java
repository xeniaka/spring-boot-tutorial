package com.wipro.training;

import com.wipro.training.controller.GreetingController;
import com.wipro.training.service.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootScopeTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootScopeTutorialApplication.class, args);

		GreetingController greetingController = context.getBean(GreetingController.class);

		Greeting greeting1 = context.getBean(Greeting.class);
		greeting1.setMessage("Hi");

		Greeting greeting2 = context.getBean(Greeting.class);
		greeting2.setMessage("Hello");

		greetingController.saySomething(greeting1);
		greetingController.saySomething(greeting2);
	}

}

