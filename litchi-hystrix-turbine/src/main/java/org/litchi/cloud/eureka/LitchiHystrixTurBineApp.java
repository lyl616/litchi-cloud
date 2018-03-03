package org.litchi.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
 

@SpringBootApplication 
@EnableTurbine
public class LitchiHystrixTurBineApp {
	public static void main(String[] args) {
		SpringApplication.run(LitchiHystrixTurBineApp.class, args);
	}
}
