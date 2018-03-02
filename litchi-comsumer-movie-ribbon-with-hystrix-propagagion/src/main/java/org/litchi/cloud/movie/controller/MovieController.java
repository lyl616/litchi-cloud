package org.litchi.cloud.movie.controller;

import org.litchi.cloud.movie.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController 
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
 
	@HystrixCommand(fallbackMethod = "findUserFallBack", 
			commandProperties = @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE"))
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://litchi-provider-user/find/" + id, User.class);

	}

	public User findUserFallBack(Long id) {
		User user = new User();
		user.setId(0l);
		return user;
	}
 
}
