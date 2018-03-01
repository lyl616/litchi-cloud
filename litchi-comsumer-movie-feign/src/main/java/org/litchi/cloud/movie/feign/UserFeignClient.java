package org.litchi.cloud.movie.feign;

import org.litchi.cloud.movie.bo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("litchi-provider-user")
public interface UserFeignClient {

	@GetMapping("/find/{id}")
	public User findUser(@PathVariable("id") Long id);

	@PostMapping("/user")
	public User postUser(@RequestBody User user);

	@GetMapping("/get-user")
	public User getUser(User user);

}
