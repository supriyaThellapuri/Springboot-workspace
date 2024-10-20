package com.tsp.repository;

import org.springframework.data.repository.CrudRepository;

import com.tsp.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> 
{

	
}
