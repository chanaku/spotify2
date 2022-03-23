package com.chana.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestController {
	@Autowired
	private RestTemplate restTemplate;
	
	public void test() {
		System.out.println("test login");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		ResponseEntity<String> response = restTemplate.postForEntity( "https://accounts.spotify.com/authorize"  ,auth.getPrincipal(), String.class);
		System.out.println(response);
	}
}
