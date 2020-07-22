package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

priavte static final String url="htps://localhost:8081/app";

	public static void main(String[] args) {
//changed here********************8

		SpringApplication.run(Application.class, args);
           int a =100;
	}

}
