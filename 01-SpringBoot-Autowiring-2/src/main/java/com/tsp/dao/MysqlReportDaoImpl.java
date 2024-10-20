package com.tsp.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MysqlReportDaoImpl implements ReportDao{
	
	public MysqlReportDaoImpl()
	{
		System.out.println("MysqlDaoImpl :: constructor called");
	}

	@Override
	public String findData() {
		// TODO Auto-generated method stub
		System.out.println("fetching data from the mysql dao..");
		return "report data";
	}

}
