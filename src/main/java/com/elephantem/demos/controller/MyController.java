package com.elephantem.demos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * This is a sample controller with request mapping of '/' and 'action'.
 *
 * @author Chintan
 */
@Controller
public class MyController {

	/**
	 * {@code index.html} mapping
	 *
	 * @return name of {@code View}
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loadIndex() {

		System.out.println("index");
		return "index";
	}

	/**
	 * A form submitting through {@code index.html} will come to action mapping. This method retrieve {@code
	 * name} attribute from post request using {@code RequestParam} annotation. If value is not come in param
	 * then default will be 'World!'. After retrieving param it will add it to {@code Model} and return to
	 * result view.
	 *
	 * @param name  user name or default World!
	 * @param model
	 *
	 * @return result of {@code View}
	 */
	@RequestMapping(value = "/action", method = RequestMethod.POST)
	public String action(@RequestParam(value = "name", defaultValue = "World!") String name, Model model) {

		System.out.println("action: " + name);
		model.addAttribute("name", name);
		return "result";
	}
}
