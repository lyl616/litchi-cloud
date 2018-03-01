package org.litchi.cloud.movie.feign;

import org.litchi.cloud.config.TestFeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "xxx", url = "http://localhost:8761/", configuration = TestFeignConfiguration.class)
public interface TestFeignClient {
	
	@RequestMapping(value = "/eureka/apps/{serviceName}", method = RequestMethod.GET)
	public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
	
	
}
