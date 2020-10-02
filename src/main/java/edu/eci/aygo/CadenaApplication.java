package edu.eci.aygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "edu.eci.aygo")
public class CadenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenaApplication.class, args);
	}
}
