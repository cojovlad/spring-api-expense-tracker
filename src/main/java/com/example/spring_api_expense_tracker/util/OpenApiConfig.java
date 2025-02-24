package com.example.spring_api_expense_tracker.util;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI expenseTrackerOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Expense Tracker API")
                        .description("API documentation for Expense Tracker")
                        .version("1.0"));
    }
}
