package com.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Comment;
import com.app.Entities.Post;
import com.app.Services.dbService;

@RestController
@RequestMapping("/comment")

public class CommentController {

	@Autowired
	Post post;
	
	@Autowired
	dbService service;

	@PostMapping("/store")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Comment store(@RequestBody Comment comment) {
		service.addComment(comment);
		return comment;
	}

	@GetMapping("/{id}")
	public Comment get(@PathVariable Integer id) {
		return service.getComment(id);
	}

	@GetMapping("post")
	public Post getPost(@ModelAttribute("post") Post post) {
		return post;
	}
}
