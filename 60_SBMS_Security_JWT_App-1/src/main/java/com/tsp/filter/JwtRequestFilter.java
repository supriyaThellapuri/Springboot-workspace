package com.tsp.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.tsp.service.MyUserDetailsService;
import com.tsp.util.JwtUtil;

public class JwtRequestFilter extends OncePerRequestFilter{
	
    @Autowired
	private MyUserDetailsService userDetailsService;
    
    @Autowired
	private JwtUtil jwtUtil;
	
	

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		final String token = request.getHeader("Authorization");
		String username = null;
		String jwt = null;
		if(token != null && token.startsWith("Bearer")) {
			jwt = token.substring(7);
			username = jwtUtil.extractUsername(jwt);
		}
		if(username != null && securtiyContextHolder.getContext().getAuthentication() == null)
		{
			UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
			if(jwtUtil.validateToken(jwt,userDetails))
			{
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new  Username(userDetails,null,userDetails.getAuthorities());
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
		}
		chain.doFilter(request, response);
	}
}
