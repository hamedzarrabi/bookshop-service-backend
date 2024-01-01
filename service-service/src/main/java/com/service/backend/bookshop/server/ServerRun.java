package com.service.backend.bookshop.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.service.backend.bookshop.*"})
@ComponentScan(basePackages = {"com.service.backend.bookshop.*"})
@EnableJpaRepositories(basePackages = {"com.service.backend.bookshop.*"})
public class ServerRun {
    public static void main(String[] args) {
        SpringApplication.run(ServerRun.class, args);
    }
}
