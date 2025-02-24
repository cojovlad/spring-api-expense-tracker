package com.example.spring_app_expense_tracker_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"controller", "repository"})  // Ensure it scans the repository package
@EntityScan("entity")  // Ensure it scans your entity package
@EnableJpaRepositories("repository")  // Enable JPA repositories
public class SpringAppExpenseTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppExpenseTrackerApiApplication.class, args);
	}

}
