package com.javatpoint.controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class UserController.java
{  
@RequestMapping("/")  
public String demo()   
{  
return "Hello java";  
}  
}  