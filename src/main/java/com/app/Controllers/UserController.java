package com.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.User;
import com.app.Services.dbService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	dbService service;

	@PostMapping("/store")
	@ResponseStatus(value = HttpStatus.CREATED)
	public User store( @RequestBody User user) {
		service.addUser(user);
		return user;
	}

	@GetMapping("/{id}")
	public User get(@PathVariable Integer id) {
		return service.getUser(id);
	}

}
