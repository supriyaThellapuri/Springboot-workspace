package com.tsp.rest;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
	
	private RedisTemplate<String, String> redisTemplate;
	
	private HashOperations<String, Integer, User> hashOps;
	
	public CourseRestController(RedisTemplate<String, String> redisTemplate)
	{
		this.redisTemplate = redisTemplate;
		hashOps = redisTemplate.opsForHash();
		
	}
	@PostMapping("/store")
	public String storeData(@RequestBody User user)
	{
//		hashOps.put("PERSONS",  user.getName(), user);
		return "succes";
	}
	@GetMapping("user/{uid}")
	public User getData(@PathVariable Integer uid)
	{
		User value = (User) hashOps.get("PERSONS", uid);
		return value;
	}
	
	@GetMapping("/user/{uid}")
	public User getData1(@PathVariable Integer uid)
	{
		User value = (User) hashOps.get("PERSONS", uid);
		return value;
	}
	
	@DeleteMapping("/user/{uid}")
	public String deleteUser(@PathVariable Integer uid)
	{
		hashOps.delete("PERSONS", uid);
		return "User Deleted";
	}

}
