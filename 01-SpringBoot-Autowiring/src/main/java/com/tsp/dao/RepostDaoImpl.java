package com.tsp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class RepostDaoImpl implements RepostDao{
	
	public RepostDaoImpl()
	{
		System.out.println("repostDaoImpl :: constructor");
	}

	@Override
	public String findData() {
		// TODO Auto-generated method stub
		System.out.println("fetching report from the dao");
		return "report data";
	}

	

}
