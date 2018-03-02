package org.litchi.cloud.movie.feign;

import org.litchi.cloud.movie.bo.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeignClient {

	@Override
	public User findById(Long id) {
		return new User(0l);
	}

}
