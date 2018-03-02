package org.litchi.cloud.movie.feign;

import org.litchi.cloud.movie.bo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "litchi-provider-user", fallbackFactory = HystrixClientFactory.class)
public interface UserFeignClient {

	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id);

}
