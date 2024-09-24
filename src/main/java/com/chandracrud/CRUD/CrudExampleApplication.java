package com.chandracrud.CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@ComponentScan
@SpringBootApplication
public class CrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudExampleApplication.class, args);
	}

}
