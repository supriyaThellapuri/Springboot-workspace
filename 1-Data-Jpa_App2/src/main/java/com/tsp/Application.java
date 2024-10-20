package com.tsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tsp.entity.Student;
import com.tsp.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		Student s1 = new Student();
		
		s1.setStudent_Id(101);
		s1.setStudent_Name("priya");
		s1.setStudent_Branch("CSE");
		s1.setStudent_marks(545);
		s1.setStudent_Address("chennai");
		
		studentRepository.save(s1);
		
		System.out.println("Record inserted successfully............");
	}

}
