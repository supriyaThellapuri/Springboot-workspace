package com.tsp.dao;


import org.springframework.stereotype.Repository;

@Repository

public class OracelRepostDaoImpl implements RepostDao{
	
	public OracelRepostDaoImpl()
	{
		System.out.println("oracel repostDaoImpl :: constructor");
	}

	@Override
	public String findData() {
		// TODO Auto-generated method stub
		System.out.println("fetching report from the oracel data base..");
		return "report data";
	}

	

}
