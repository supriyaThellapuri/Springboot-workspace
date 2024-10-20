package com.tsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsp.dao.RepostDaoImpl;

@Service
public class ReportService {
 private RepostDaoImpl repost;
 

 

 public ReportService(RepostDaoImpl repost)
 {
	 System.out.println("Report service :: param constructor called...");
	 this.repost = repost;
 }

// public void setRepostDao(RepostDaoImpl repost)
// {
//	 System.out.println("setRepostDao() method called");
//	 this.repost = repost;
// }
 
 public void generateReport()
 {
	 repost.findData();
	 System.out.println("Generating report");
 }
 
}
