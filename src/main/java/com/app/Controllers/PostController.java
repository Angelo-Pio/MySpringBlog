package com.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Post;
import com.app.Services.dbService;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	dbService service;
	
	@PostMapping("/store")
	@ResponseStatus(value = HttpStatus.CREATED)
	public void store(@RequestBody Post post, Model model){
		service.addPost(post);
		model.addAttribute("post", model);
	}
	
	@GetMapping("/{title}")
	public Post get(@PathVariable String title) {
		return service.getPost(title);
	}
	
	@GetMapping("/postModel")
	@ModelAttribute("post")	
	public Post getModel(@ModelAttribute("post") Post post) {
		return post;
	}
	
	
	
	
	
	
}
