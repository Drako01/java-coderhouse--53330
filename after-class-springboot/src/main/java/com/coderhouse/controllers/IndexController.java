package com.coderhouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/productos-para-comprar")
	public String productos() {
		return "productos";
	}

}
