package ca.uskoski.testzone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
	@GetMapping(path = "/greeting")
	public String greeting()
	{
		return "Hello world!";
	}
}
