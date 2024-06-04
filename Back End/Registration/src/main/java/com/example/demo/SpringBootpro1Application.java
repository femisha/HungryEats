package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.app.*")
@EnableJpaRepositories(basePackages="com.app.*")
@EntityScan(basePackages="com.app.*")
@SpringBootApplication
public class SpringBootpro1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootpro1Application.class, args);
	}

}
