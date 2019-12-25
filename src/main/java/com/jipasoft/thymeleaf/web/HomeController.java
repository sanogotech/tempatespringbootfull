package com.jipasoft.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	

	@GetMapping({ "/toto", "/todoindex" })
	public String index() {

		return "index";
	}

	

}
