package com.tsp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tsp.entity.Student;
import com.tsp.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository s = context.getBean(StudentRepository.class);
		
		Student s1 = new Student(101,"priya",598,"Ind");
		s.save(s1);
		System.out.println("Recorded inserted successfully...");
		Student s2 = new Student(102,"Abc",578,"hyd");
		Student s3 = new Student(103, "pqr",896,"Ind");
		Student s4 = new Student(104,"xyz",980,"Hyd");
		Student s5 = new Student(105,"klm",890,"Ind");
		Student s6 = new Student(016,"bca",789,"Ap");
		s.saveAll(Arrays.asList(s2,s3,s4,s5));
		System.out.println("************************");
		Optional<Student> findByid = s.findById(101);
		if(findByid.isPresent())
		{
			System.out.println(findByid);
		}
		System.out.println("*******************");
		
		boolean exist = s.existsById(103);
		System.out.println(exist);
		System.out.println("********************");
		
		s.deleteById(016);
		System.out.println("Record deleted successfully");
		
		System.out.println("*****************************");
		
		List<Student> address = s.findByStuLocation("Ind");
		address.forEach(Student->{
			System.out.println(Student);
		});
		
		System.out.println("*******************");
		List<Student> name = s.findByStuName("Abc");
		name.forEach(Student->{
			System.out.println(Student);
		});
		System.out.println("*********************");
		
		List<Student> marks = s.findByStuMarksAndStuLocation(598,"Ind");
		marks.forEach(Student->{
			System.out.println(Student);
		});
		System.out.println("******************");
		List<Student> list = s.findByStuLocationOrStuName("Ind","Abc");
		list.forEach(Student->{
			System.out.println(Student);
		});
		System.out.println("*****************");
		
		
	}

}
