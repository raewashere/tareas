package com.raymundo.tareas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sistema de gestión de tareas")
                        .version("1.0.0")
                        .description(
                                "API REST para gestionar tareas, con buenas prácticas de desarrollo"));
    }

}
