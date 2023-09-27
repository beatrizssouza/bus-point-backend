package com.faculdade.buspointbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class})
@ComponentScan(
		basePackages = {
					"com.faculdade.buspointbackend.config",
					"com.faculdade.buspointbackend.controller",
					"com.faculdade.buspointbackend.domain.*",
				 	"com.faculdade.buspointbackend.exceptions.*",
				  	"com.faculdade.buspointbackend.repository",
					"com.faculdade.buspointbackend.services"

		})
@EntityScan("com.faculdade.buspointbackend.domain.entity")
public class BusPointBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusPointBackendApplication.class, args);
	}

}
