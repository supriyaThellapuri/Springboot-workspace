package com.tsp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.models.AuthenticationRequest;
import com.tsp.models.AuthenticationResponse;
import com.tsp.service.MyUserDetailsService;
import com.tsp.util.JwtUtil;

@RestController
public class HelloRestController {
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@RequestMapping({"/hello"})
	public String firstPage()
	{
		return "hello world";
	}
	@RequestMapping(value = "/token", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest aunthenticationRequest)
	{
		try
		{
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					aunthenticationRequest.getClass(), aunthenticationRequest.getPassword()));
		}
		catch(BadCredentialsException e)
		{
			throw new Exception("Incorrect username or password",e);
		}
		final UserDetails userDetails = userDetailsService.loadUserByUsername(aunthenticationRequest.getUsername(),aunthenticationRequest.getPassword());
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
		
	}

}
