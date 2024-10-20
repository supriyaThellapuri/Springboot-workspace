package com.tsp;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

public class Main {
 public static void main(String[] args) throws Exception
 {
	Order order = new Order();
	order.setOrderId(121);
	order.setOrderedBy("ram");
	order.setOrderStatus("progress");
	order.setBillAtm(120.32);
	
	Gson gson = new Gson();
	gson.toJson(order);
	System.out.println(gson);
	
	gson.fromJson(new FileReader(new File("order.json")), Order.class);
}
}
