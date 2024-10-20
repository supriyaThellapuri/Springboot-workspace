package com.tsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tsp.service.WelcomeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		WelcomeService bean = run.getBean(WelcomeService.class);
//		bean.invokeWelcomeApi();
		bean.invokeWelcome();
	}

}
