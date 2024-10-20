package com.tsp.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine1 {
	public Engine1() {
		System.out.println("Engine1 :: constuctor");
	}
	@PostConstruct
    public void init()
    {
    	System.out.println("Engine started");
    }
	@PreDestroy
    public void destory() {
    	System.out.println("Engine ended");
    }
}
