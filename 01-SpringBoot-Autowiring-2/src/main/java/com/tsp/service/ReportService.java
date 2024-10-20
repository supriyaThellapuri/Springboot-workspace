package com.tsp.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.tsp.dao.ReportDaoImpl;


@Service

public class ReportService {
	private ReportDaoImpl reportData;
	
	@Autowired
	
	public void setReportData(ReportDaoImpl reportData)
	{
		this.reportData = reportData;
	}
	
	public void generateReport()
	{
		reportData.findData();
		System.out.println("Generate the data");
	}
	

}
