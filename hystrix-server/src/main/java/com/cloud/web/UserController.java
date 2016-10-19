package com.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class UserController {

	
	@Autowired
    RestTemplate restTemplate;
	
	
	@HystrixCommand(fallbackMethod = "error")
	@RequestMapping("/userList")
    public String add() {
        return restTemplate.getForEntity("http://server/users/userList", String.class).getBody();
    }

	
	public String error() {
        return "error";
    }

}
