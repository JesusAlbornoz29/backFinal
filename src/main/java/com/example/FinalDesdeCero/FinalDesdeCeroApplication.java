package com.example.FinalDesdeCero;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalDesdeCeroApplication {

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(FinalDesdeCeroApplication.class, args);


		}

		// creame una funcion que devuelva un numero par
	}



