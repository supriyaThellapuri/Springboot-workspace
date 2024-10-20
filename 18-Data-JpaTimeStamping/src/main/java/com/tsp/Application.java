package com.tsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tsp.entity.Product;
import com.tsp.repository.ProductRepository;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		
		Product p1 = new Product();
		p1.setPid(101);
		p1.setPname("mouse");
		p1.setPrice(100.00);
		productRepository.save(p1);
		
	}

}
