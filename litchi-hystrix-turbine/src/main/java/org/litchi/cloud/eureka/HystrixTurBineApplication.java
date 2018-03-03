package org.litchi.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
 

@SpringBootApplication 
@EnableTurbine
public class HystrixTurBineApplication {
	public static void main(String[] args) {
		SpringApplication.run(HystrixTurBineApplication.class, args);
	}
}
