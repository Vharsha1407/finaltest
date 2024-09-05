package com.ftest.ftest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class App {
	
    public static void main(String[] args) {
    	SpringApplication.run(App.class, args);
    }
    @GetMapping("/hello")
    public String hello() {
    	return "Hi! Welcome to VTeam";
    }
    @GetMapping("/welcome")
    public String welcome() {
    	return "Welcome to Verizon";
    }
    @GetMapping("/farewell")
    public String farewell() {
    	return "Goodbye, see you soon";
    }
}
