package com.tsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		RestTemplate rt = new RestTemplate();
		String apiURL = "https://www.facebook.com";
		ResponseEntity<String> forEntity = rt.getForEntity(apiURL, String.class);
		String body = forEntity.getBody();
		System.out.println(body);
			}

}
