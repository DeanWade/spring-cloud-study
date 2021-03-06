package com.itmuch.cloud.study.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.user.entity.User;
import com.itmuch.cloud.study.user.feign.UserClient;

@RestController
public class TestFeignController {
	@Autowired
	private UserClient userClient;

	@GetMapping("feign/{id}")
	public User test(@PathVariable Long id) {
		User user = this.userClient.findById(id);
		return user;
	}
}
