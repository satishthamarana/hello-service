package com.hello.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/say")
	public String sayHello() {
		return "Welcome to Hello World!....Hello Satheesh Chepuri";
	}

	@GetMapping("/hi")
	public String say() {
		return "Welcome to New World";
	}

}
