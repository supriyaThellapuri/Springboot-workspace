package com.tsp.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable>{

}
