package com.tsp.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

    @GetMapping("/course")
    public ResponseEntity<String> getCourseFee(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
        String respPayload = cname + " By " + tname + " fee is 600 INR";
        return new ResponseEntity<>(respPayload, HttpStatus.OK);
    }
    
    @GetMapping("/book/name/{bname}/author/{aname}")
    public ResponseEntity<String> getBook(@PathVariable("bname") String bname,@PathVariable("aname") String aname)
    {
    	String resBody = bname + " By " + aname + " is out of stock";
    	
    	return new ResponseEntity<>(resBody, HttpStatus.OK);
    }
}
