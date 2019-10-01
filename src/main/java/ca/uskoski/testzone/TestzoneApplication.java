package ca.uskoski.testzone;

import ca.uskoski.testzone.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestzoneApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(new Class[] { TestzoneApplication.class, GreetingController.class }, args);
	}

}
