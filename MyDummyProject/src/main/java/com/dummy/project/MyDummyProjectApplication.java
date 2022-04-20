package com.dummy.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDummyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDummyProjectApplication.class, args);
		System.out.println("Hello this is my dummy project");
	}

}
