package com.tsp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
 /*~~(Migrate manually based on https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter)~~>*/@Override
protected void configure(HttpSecurity http) throws Exception {
	// TODO Auto-generated method stub
	   http.authorizeRequests()
	  .antMatchers("/balance").authenticated()
	  .antMatchers("/statement").authenticated()
	  .antMatchers("/myloan").authenticated()
	  .antMatchers("/home").permitAll()
	  .antMatchers("/contact").permitAll()
	  .and().formLogin()
	  .and().httpBasic();
	
}
 @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
	 auth.inMemoryAuthentication()
	     .withUser("priya").password("priya@1234").authorities("admin").and()
	     .withUser("abc").password("abc@1234").authorities("read").and()
         .passwordEncoder(NoOpPasswordEncoder.getInstance());	 
		
	}
}
