package com.tsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.User;

public interface UserRepository extends JpaRepository<User,Long>
{

}
