package org.litchi.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulFilterApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulFilterApplication.class, args);
	}

	@Bean
	public PreZuulFilter PreZuulFilter() {
		return new PreZuulFilter();
	}
}
