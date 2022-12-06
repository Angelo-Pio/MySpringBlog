package com.app.Entities;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.Utility.Enums.Evaluation;

@Component
public class Comment {

	private Integer ID;
	private String text;
	private Evaluation ev;

	@Autowired
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	// Boiler Code
	public Comment(String text, Evaluation ev, Integer ID) {
		super();
		this.text = text;
		this.ev = ev;
		this.ID = ID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, ev, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(ID, other.ID) && ev == other.ev && Objects.equals(text, other.text);
	}

	@Override
	public String toString() {
		return "Comment [ID=" + ID + ", text=" + text + ", ev=" + ev + "]";
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Evaluation getEv() {
		return ev;
	}

	public void setEv(Evaluation ev) {
		this.ev = ev;
	}

}
