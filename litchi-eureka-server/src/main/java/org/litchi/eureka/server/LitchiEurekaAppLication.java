package org.litchi.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LitchiEurekaAppLication {
	public static void main(String[] args) {
		SpringApplication.run(LitchiEurekaAppLication.class, args);
	}
}
