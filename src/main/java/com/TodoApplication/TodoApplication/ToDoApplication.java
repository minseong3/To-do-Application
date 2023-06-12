package com.TodoApplication.TodoApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoApplication {

	@GetMapping
	public String helloWorld() {
		return "To-do Application !";
	}
}
