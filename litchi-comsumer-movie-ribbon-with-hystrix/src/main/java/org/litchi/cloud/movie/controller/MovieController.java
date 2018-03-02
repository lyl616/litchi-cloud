package org.litchi.cloud.movie.controller;

import org.litchi.cloud.movie.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@HystrixCommand(fallbackMethod = "findUserFallBack")
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://litchi-provider-user/find/" + id, User.class);

	}

	public User findUserFallBack(Long id) {
		User user = new User();
		user.setId(0l);
		return user;
	}

	@GetMapping("/test")
	public String test() {
		ServiceInstance instance1 = this.loadBalancerClient.choose("litchi-provider-user");
		System.out.println("111:" + instance1.getServiceId() + ":" + instance1.getHost() + ":" + instance1.getPort());
		ServiceInstance instance2 = this.loadBalancerClient.choose("litchi-provider-user2");
		System.out.println("222:" + instance2.getServiceId() + ":" + instance2.getHost() + ":" + instance2.getPort());
		return "测试";
	}
}
