package com.toy.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//패키지 경로 잡아주기.
@ComponentScan(basePackages={"com.toy.project.controller"})
@SpringBootApplication
public class ToyProApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToyProApplication.class, args);
	}

}
