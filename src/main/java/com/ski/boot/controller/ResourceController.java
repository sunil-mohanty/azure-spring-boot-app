package com.ski.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ski.boot.config.Configuration;

@RestController
public class ResourceController {

	
	@Autowired
	private Configuration config;
	
	@GetMapping("/price-list")
	public  List<String> getItem(){
		
	   List<String> fruitNames = config.getName();
	   List<String> result = new ArrayList<>();
	   
	   
	   fruitNames.stream().forEach(e->{
		   result.add(config.getQuantity().get(fruitNames.indexOf(e)) + " kg  " + e  + " $" +config.getPrice().get(fruitNames.indexOf(e)));
		   
	   });
       return result;
	}
}
