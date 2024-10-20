package com.tsp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
   @GetMapping("/")	
   public String m1()
   {
	   System.out.println("m1() method executed");
	   String msg = "This is m1() method response";
	   try {
	   int i = 10/0;
	   }
	   catch(Exception e)
	   {
	 msg =   m2();
	   }
	   return msg;
   }
   
  
   public String m2()
   {
	   String msg = "This is m2() method response";
	   return msg;
   }
}
