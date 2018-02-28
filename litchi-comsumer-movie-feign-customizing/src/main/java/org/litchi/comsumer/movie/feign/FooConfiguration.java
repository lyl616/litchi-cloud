package org.litchi.comsumer.movie.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class FooConfiguration {
	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}

}
