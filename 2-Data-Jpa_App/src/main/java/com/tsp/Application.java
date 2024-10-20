package com.tsp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.tsp.entity.User;
import com.tsp.repository.UserMasterRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserMasterRepository userRepository = context.getBean(UserMasterRepository.class);
		
		
		
//		List<User> list = userRepository.getAllUsersHql();
//		list.forEach(User->{
//			System.out.println(User);
//		});
//		
//		System.out.println("**********************************");
//		
//		List<User> list1 = userRepository.getAllUsersSql();
//		list1.forEach(User->{
//			System.out.println(User);
//		});
//		System.out.println("**************************");
//		
//		List<User> list2 = userRepository.getAllUsersByCountry("Ind");
//		list2.forEach(User->{
//			System.out.println(User);
//		});
		
//		User u1 = new User(105,"abc","Female",22,"XYZ");
//		User u2 = new User(106,"def","male",20,"ZXY");
//		User u3 = new User(107,"ghi","Female",32,"YXZ");
//		User u4 = new User(108,"jkl","male",29,"XYZ");
//		User u5 = new User(109,"mno","Female",42,"XZT");
//		User u6 = new User(110,"pqr","male",21,"XZY");
//		User u7 = new User(111,"stu","Female",22,"XYZ");
//		
//		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6,u7));
		
//		List<User> users = userRepository.findAll();
//		users.forEach(User ->{
//			System.out.println(User);
//		});
		
		List<User> users = userRepository.findAll(Sort.by("userName","age").descending());
		users.forEach(User->{
			System.out.println(User);
		});
		int pageSize = 5;
		int pageNumber = 0;
		
	PageRequest pageRequest = PageRequest.of(pageNumber,pageSize);
	
	Page<User> pageData = userRepository.findAll(pageRequest);
	
	List<User> list = pageData.getContent();
	
	users.forEach(User->{
		System.out.println(User);
	});
	
	User entity = new User();
	entity.setCountry("India");
	
	Example<User> example = Example.of(entity);
	List<User> user = userRepository.findAll(example);
	user.forEach(User ->{
		System.out.println(User);
	});
	
		

		
		
		
	}

}
