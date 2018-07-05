package org.greysalmon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//stereotype annotation
@Controller
public class HelloWorldController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {

		// it is a map, so it takes string as a key and the value, that might be
		// any object
		model.addAttribute("message", "Welcome form spring MVC");

		// this is the logical view name, that will later go through the view
		// resolver
		return "welcome";
	}

	// providing another mapping for unique identifying the handler method
	@RequestMapping(value = "/home/{user}", method = RequestMethod.GET)
	// getting a value form URL: declare variable matching the placeholder in
	// the mapping and then the type and the java variable
	public String sayHelloAgain(@PathVariable("user") String user, ModelMap model) {

		// it is a map, so it takes string as a key and the value, that might be
		// any object
		model.addAttribute("message", "Welcome Again form spring MVC");
		// adding the user variable to the model, so that it can be access in
		// the .jsp by the attribute name
		model.addAttribute("userData", user);

		// this is the logical view name, that will later go through the view
		// resolver
		return "welcome";
	}

}
