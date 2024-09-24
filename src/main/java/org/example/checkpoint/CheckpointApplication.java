package org.example.checkpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CheckpointApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckpointApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .defaultHeader("Authorization", "Token PYFYMri0kGNF8aDnbuPACbtbh")
                .build();
    }

    @Bean
    public ProffService proffService(RestTemplate restTemplate) {
        return new ProffService(restTemplate);
    }
}
