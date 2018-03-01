package org.litchi.cloud.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MovieFeignCostomiZingApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieFeignCostomiZingApplication.class, args);
	}
}
