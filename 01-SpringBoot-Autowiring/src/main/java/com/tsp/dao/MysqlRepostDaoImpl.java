package com.tsp.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MysqlRepostDaoImpl implements RepostDao{
	
	public MysqlRepostDaoImpl()
	{
		System.out.println("MysqlrepostDaoImpl :: constructor");
	}

	@Override
	public String findData() {
		// TODO Auto-generated method stub
		System.out.println("fetching report from the mysql database..");
		return "report data";
	}

	

}
