package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo")
@EnableAutoConfiguration
public class MySqlDbApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySqlDbApplication.class, args);
		System.out.println("Happy Hacking");
	}
}
