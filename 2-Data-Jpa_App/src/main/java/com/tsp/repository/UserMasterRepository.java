package com.tsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tsp.entity.User;

public interface UserMasterRepository extends JpaRepository<User,Integer>{
	
	
	
	@Query(value = "From User")
	public List<User> getAllUsersHql();
	
	@Query(value = "select * from user_masters", nativeQuery=true)
	public List<User> getAllUsersSql();
	
	@Query(value = "from User where country=:cname")
	public List<User> getAllUsersByCountry(String cname);

}
