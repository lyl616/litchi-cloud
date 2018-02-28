package org.litchi.comsumer.movie.controller;

import org.litchi.comsumer.movie.bo.User;
import org.litchi.comsumer.movie.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@Autowired
	private UserFeignClient userFeignClient;

	@GetMapping("/movie/{id}")
	public User findById(@PathVariable("id") Long id) {
		return this.userFeignClient.findUser(id);
	}

	@GetMapping("/test/{id}")
	public User testPost(@PathVariable("id") Long id) {
		return this.postUser(this.userFeignClient.findUser(id));
	}

	@PostMapping("/user")
	public User postUser(User user) {
		return this.userFeignClient.postUser(user);
	}

	@GetMapping("/test-get/{id}")
	public User testGet(@PathVariable("id") Long id) {
		return this.getUser(this.userFeignClient.findUser(id));
	}

	// 该请求不会成功，只要参数是复杂对象，即使指定了是GET方法，feign依然会以POST方法进行发送请求。可能是我没找到相应的注解或使用方法错误。
	@PostMapping("/get-user")
	public User getUser(User user) {
		return this.userFeignClient.getUser(user);
	}

}
