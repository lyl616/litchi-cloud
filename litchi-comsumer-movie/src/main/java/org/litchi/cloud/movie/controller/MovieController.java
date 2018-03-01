package org.litchi.cloud.movie.controller;

import org.litchi.cloud.movie.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {


	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://litchi-provider-user/find/" + id, User.class);
//		return this.restTemplate.getForObject("http://localhost:7900/find/" + id, User.class);
	}
}
