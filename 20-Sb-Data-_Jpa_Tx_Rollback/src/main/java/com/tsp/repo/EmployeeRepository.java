package com.tsp.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

	

}
