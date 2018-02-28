package org.litchi.provider.user.controller;

import org.litchi.provider.user.entity.User;
import org.litchi.provider.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private EurekaClient eurekaClient;
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/find/{id}")
	public User findUser(@PathVariable Long id) {
		return this.userRepository.findOne(id);
	}

	@PostMapping("/user")
	public User postUser(@RequestBody User user) {
		return user;
	}

	@PostMapping("/get-user")
	public User getUser(User user) {
		return user;
	}

	@GetMapping("/eureka-instance")
	public String serviceUrl() {
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("LITCHI-PROVIDER-USER", false);
		return instance.getHomePageUrl();
	}

	@SuppressWarnings("deprecation")
	@GetMapping("/instance-info")
	public ServiceInstance serviceUrlw() {
		return discoveryClient.getLocalServiceInstance();
	}

}
