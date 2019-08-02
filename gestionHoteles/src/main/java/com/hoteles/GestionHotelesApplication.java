package com.hoteles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hoteles.config.AppConfig;

@SpringBootApplication
public class GestionHotelesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionHotelesApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
