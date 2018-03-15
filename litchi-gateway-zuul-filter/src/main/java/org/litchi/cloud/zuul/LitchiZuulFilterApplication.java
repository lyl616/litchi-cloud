package org.litchi.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication 
@EnableZuulProxy
public class LitchiZuulFilterApplication {
	public static void main(String[] args) {
		SpringApplication.run(LitchiZuulFilterApplication.class, args);
	}
}
