package com.roma.webflux_init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = "com.roma.webflux_init.domain")
public class WebfluxInitApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxInitApplication.class, args);
	}

}
