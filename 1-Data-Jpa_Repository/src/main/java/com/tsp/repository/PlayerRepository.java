package com.tsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.Player;

//@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{

	
	

}
