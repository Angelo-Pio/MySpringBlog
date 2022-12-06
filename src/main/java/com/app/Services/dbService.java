package com.app.Services;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.app.Entities.Comment;
import com.app.Entities.Post;
import com.app.Entities.User;

@Service
public class dbService {
	
		
	private HashMap<String,Post> posts = new HashMap<>();
	private HashMap<Integer,Comment> comments = new HashMap<>();
	private HashMap<Integer,User> users = new HashMap<>();
	
	public void addPost(Post post) {
		posts.put(post.getTitle(), post);
	}
	public void addComment(Comment comment) {
		comments.put(comment.getID(),comment);
	}
	
	public void addUser(User user) {
		users.put(user.getID(), user);
	}
	
	public Post getPost(String title) {
		return posts.get(title);
	}
	
	public Comment getComment(Integer id) {
		return comments.get(id);
	}
	
	public User getUser(Integer id) {
		return users.get(id);
	}
	
	
	
}
