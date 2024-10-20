package com.tsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tsp.entity.Player;
import com.tsp.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context  = SpringApplication.run(Application.class, args);
		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
		
		Player p1 = new Player();
		p1.setPalyerId(101);
		p1.setPlayerName("supriya");
		p1.setPlayerAge(23);
		p1.setPlayerLocation("Hyderabad");
		
		
		playerRepository.save(p1);
		
		Player p2 = new Player();
		p2.setPalyerId(123);
		p2.setPlayerName("Hari");
		p2.setPlayerAge(24);
		p2.setPlayerLocation("mumbai");
		
		playerRepository.save(p2);
		System.out.println("Record updated successfully");
		playerRepository.deleteById(101);
		System.out.println("Record deleted successfully");
		
		
		 
		
		
		
		System.out.println("Record inserted successfully");
	}

}
