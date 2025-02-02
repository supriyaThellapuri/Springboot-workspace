package com.tsp.service;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException
	{
		return new User("admin","admin@123", new ArrayList<>());
	}

}
