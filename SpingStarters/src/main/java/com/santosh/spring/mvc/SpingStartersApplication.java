package com.santosh.spring.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"com.santosh.spring.mvc", "com.santosh.spring.mvc.controller"})
public class SpingStartersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingStartersApplication.class, args);
	}
}
