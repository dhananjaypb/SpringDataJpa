package com.spring.jpa.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.spring.jpa.SpringDataJPA.repository")
@EntityScan(basePackages="com.spring.jpa.SpringDataJPA.model")
@SpringBootApplication
public class SpringDataJpaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
}
