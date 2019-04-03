package com.capgemini.capstore.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@ComponentScan("com.capgemini.capstore")
@EntityScan("com.capgemini.capstore.beans")



public class CapStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapStoreApplication.class, args);
	}
}
