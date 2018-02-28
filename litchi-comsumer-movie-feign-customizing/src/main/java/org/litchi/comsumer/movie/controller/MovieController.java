package org.litchi.comsumer.movie.controller;

import org.litchi.comsumer.movie.bo.User;
import org.litchi.comsumer.movie.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@Autowired
	private UserFeignClient userFeignClient;

	@GetMapping("/movie/{id}")
	public User findById(@PathVariable("id") Long id) {
		return this.userFeignClient.findUser(id);
	}
 

}
