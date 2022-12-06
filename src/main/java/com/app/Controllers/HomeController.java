package com.app.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<String>  index (){
		return new ResponseEntity<String>("Hello, welcome to 'MySpringBlog'", HttpStatus.OK);
	}
	@GetMapping("/error/pageNotFound")
	public ResponseEntity<String>  errorPageNotFound (){
		return new ResponseEntity<String>("This page is not avaiable in 'MySpringBlog'", HttpStatus.NOT_FOUND);
	}
	@GetMapping("/error/forbidden")
	public ResponseEntity<String>  errorForbidden (){
		return new ResponseEntity<String>("This page is not avaiable for you in 'MySpringBlog'", HttpStatus.FORBIDDEN);
	}
}
