package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HelloWorldController   
{  
@RequestMapping("/")  
public String hello()   
{  
	return "Hello Vishwas, How are you";  
}  
}  