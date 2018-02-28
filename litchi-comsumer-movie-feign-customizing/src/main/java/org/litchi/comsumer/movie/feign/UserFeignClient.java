package org.litchi.comsumer.movie.feign;

import org.litchi.comsumer.config.UserFeignConfiguration;
import org.litchi.comsumer.movie.bo.User;
import org.springframework.cloud.netflix.feign.FeignClient;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "litchi-provider-user", configuration = UserFeignConfiguration.class)
public interface UserFeignClient {

	@RequestLine("GET /find/{id}")
	public User findUser(@Param("id") Long id);
 
}
