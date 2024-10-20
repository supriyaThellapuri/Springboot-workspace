package com.tsp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OracleReportDaoImpl implements ReportDao{
	
	public OracleReportDaoImpl()
	{
		System.out.println("OracleReportDaoImpl :: param constructor called...");
	}

	@Override
	public String findData() {
		// TODO Auto-generated method stub
		System.out.println("fetching data from the oracle dao..");
		return "report data";
	}
	

}
