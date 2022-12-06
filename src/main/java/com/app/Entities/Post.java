package com.app.Entities;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Post {

	private String title;
	private String body;
	private Integer views;

	@Autowired
	public Post() {
		// TODO Auto-generated constructor stub
	}
	
	public Post(String title, String body, Integer views) {
		super();
		this.title = title;
		this.body = body;
		this.views = views;
	}





	//Boiler Code
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	@Override
	public String toString() {
		return "Post [title=" + title + ", body=" + body + ", views=" + views + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(body, title, views);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(body, other.body) && Objects.equals(title, other.title)
				&& Objects.equals(views, other.views);
	}
	
	
	
	
}
