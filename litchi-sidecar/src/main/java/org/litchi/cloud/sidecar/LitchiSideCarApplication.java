package org.litchi.cloud.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication 
@EnableSidecar
public class LitchiSideCarApplication {
	public static void main(String[] args) {
		SpringApplication.run(LitchiSideCarApplication.class, args);
	}
}
