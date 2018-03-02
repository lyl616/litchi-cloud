package org.litchi.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard 
@SpringBootApplication 
public class LitchiHystricDashboadrAppLication {
	public static void main(String[] args) {
		SpringApplication.run(LitchiHystricDashboadrAppLication.class, args);
	}
}
