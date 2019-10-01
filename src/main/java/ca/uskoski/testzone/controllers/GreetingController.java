package ca.uskoski.testzone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
	static final String HOME_MESSAGE = "Home";
	static final String GREETING_MESSAGE = "Hello world!";

	@GetMapping(path = "/")
	public String home()
	{
		return HOME_MESSAGE;
	}

	@GetMapping(path = "/greeting")
	public String greeting()
	{
		return GREETING_MESSAGE;
	}
}
