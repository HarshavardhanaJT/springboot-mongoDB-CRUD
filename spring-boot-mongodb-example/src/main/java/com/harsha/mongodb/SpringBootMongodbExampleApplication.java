package com.harsha.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.harsha.*"})
@EntityScan(basePackages = "com.harsha.model")
@SpringBootApplication
public class SpringBootMongodbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbExampleApplication.class, args);
	}

}
