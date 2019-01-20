package com.wipro.training.application;

import com.wipro.training.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringBootXmlConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootXmlConfigurationApplication.class, args);

		GreetingController greetingController = context.getBean(GreetingController.class);
		greetingController.saySomething();
	}

}

