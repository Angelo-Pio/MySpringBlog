package com.app.Controllers;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("session")
public class SessionController {

	@GetMapping("/read")
	public String getCookie(@CookieValue("post") String cookie) {
		return cookie;
	}

	@GetMapping("/set")
	public void setCookie(HttpServletResponse response ) {
		
		Cookie c = new Cookie("post","myBeautifulPost");
		response.addCookie(c);
		
	}
}
