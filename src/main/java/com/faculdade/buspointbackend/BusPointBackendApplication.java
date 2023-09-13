package com.faculdade.buspointbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
		basePackages = {
					"com.faculdade.buspointbackend.controller",
					"com.faculdade.buspointbackend.dto",
				 	"com.faculdade.buspointbackend.entity",
				  	"com.faculdade.buspointbackend.repository",
					"com.faculdade.buspointbackend.services"

		})
@EntityScan("com.faculdade.buspointbackend.entity")
public class BusPointBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusPointBackendApplication.class, args);
	}

}
