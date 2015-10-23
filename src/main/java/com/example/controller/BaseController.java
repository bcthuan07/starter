package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@RequestMapping(value = { "/", "" })
	public String helloWorld() {
		return "Hello World!";
	}
}
