package ca.uskoski.testzone.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class GreetingControllerTest
{
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void homeShouldReturnDefaultMessage() throws Exception
	{
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
			.andExpect(content().string(containsString(GreetingController.HOME_MESSAGE)));
	}

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception
	{
		this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
			.andExpect(content().string(containsString(GreetingController.GREETING_MESSAGE)));
	}
}

