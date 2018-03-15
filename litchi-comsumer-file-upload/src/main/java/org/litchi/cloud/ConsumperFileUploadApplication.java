package org.litchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumperFileUploadApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(ConsumperFileUploadApplication.class, args);
	}
}
