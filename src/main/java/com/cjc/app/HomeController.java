package com.cjc.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/get")
	public String home() {
		
		return "welcome to docker session";
	}

}
