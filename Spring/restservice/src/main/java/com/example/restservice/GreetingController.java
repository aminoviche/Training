package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}


	@GetMapping("/consumGreeting")
	public Greeting consumGreeting(){
		Greeting consumeGreeting = restTemplate.getForObject("http://localhost:8090/greeting?name=amine", Greeting.class);
		consumeGreeting.setId(5004L);
		return consumeGreeting;
	}
}
