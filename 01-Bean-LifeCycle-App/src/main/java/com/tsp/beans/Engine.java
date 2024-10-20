package com.tsp.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Engine implements InitializingBean, DisposableBean
{

	public Engine() {
		
		// TODO Auto-generated constructor stub
		System.out.println("Engine :: constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterProperties() method called");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Before properties() method called");
		
	}

	
}
