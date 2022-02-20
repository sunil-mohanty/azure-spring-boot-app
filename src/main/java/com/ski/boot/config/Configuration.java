package com.ski.boot.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "item") 
public class Configuration {

	private List<String> name;
	private List<Double> price;
	private List<Integer> quantity;
	
	
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public List<Double> getPrice() {
		return price;
	}
	public void setPrice(List<Double> price) {
		this.price = price;
	}
	public List<Integer> getQuantity() {
		return quantity;
	}
	public void setQuantity(List<Integer> quantity) {
		this.quantity = quantity;
	}
}