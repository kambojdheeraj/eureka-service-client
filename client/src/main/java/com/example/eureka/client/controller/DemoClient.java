package com.example.eureka.client.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/client", produces = "application/json")
@CrossOrigin(origins = "*")
public class DemoClient {

	@GetMapping("/service")
	public String consume() {
		return "Service is online";
	}
}
