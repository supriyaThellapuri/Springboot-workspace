package com.tsp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tsp.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	public List<Student> findByStuLocation(String loc);
	
	public List<Student> findByStuName(String name);
	
	public List<Student> findByStuMarksAndStuLocation(Integer marks, String loc);
	
	public List<Student> findByStuLocationOrStuName(String loc,String name);

}
