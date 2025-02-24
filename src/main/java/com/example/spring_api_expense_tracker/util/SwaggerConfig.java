package com.example.spring_api_expense_tracker.util;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Expense Tracker API",
                version = "1.0",
                description = "API documentation for the Expense Tracker API"
        )
)
public class SwaggerConfig {
}
