package com.apjp.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
    public String hello() {
        return "Hello ";
    }  
	
	@RequestMapping("/oh")
    public String oh() {
        return "ohho ";
    }  
	
	@RequestMapping("/pullhua")
    public String pullhua() {
        return "pull ho gya ";
    }  


}
