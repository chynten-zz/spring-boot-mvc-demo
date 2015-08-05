package com.elephantem.demos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Chintan on 04/08/15.
 */
@Controller
public class MyController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loadIndex() {

		System.out.println("index");
		return "index";
	}

	@RequestMapping(value = "/action", method = RequestMethod.POST)
	public String action(@RequestParam(value = "name", defaultValue = "World!") String name, Model model) {

		System.out.println("action: " + name);
		model.addAttribute("name", name);
		return "result";
	}
}
