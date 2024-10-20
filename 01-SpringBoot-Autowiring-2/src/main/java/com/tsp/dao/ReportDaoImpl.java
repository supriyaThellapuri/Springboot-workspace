package com.tsp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements ReportDao{
	public ReportDaoImpl()
	{
		System.out.println("ReportDaoImpl :: param constructor called");
	}

	@Override
	public String findData() {
		// TODO Auto-generated method stub
		System.out.println("fetch data from the dao..");
		return "report data";
	}

}
