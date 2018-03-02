package org.litchi.cloud.movie.feign;

import org.litchi.cloud.movie.bo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class HystrixClientFactory implements FallbackFactory<UserFeignClient> {

	private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFactory.class);

	@Override
	public UserFeignClient create(Throwable e) {
		HystrixClientFactory.LOGGER.info("fallback》》》》》》》》》》》》》:", e.getMessage());
		return new UserFeignClientWithFactory() {
			@Override
			public User findById(Long id) {
				return new User(-1l);
			}
		};
	}

}
