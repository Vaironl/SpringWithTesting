package com.example.restservice;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetingControllerTests {

	@Autowired
	private GreetingController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void mainPageMessage() {
		
	}
	
	@Test
	public void greetingShouldReturnName() {
		
		String name = "John Doe";
		Greeting greeting = controller.greeting(name);
		assertThat(greeting).hasFieldOrProperty("content");
		assertThat(greeting.getContent()).contains("Hello, " + name);
	}
}