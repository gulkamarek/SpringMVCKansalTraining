package org.greysalmon.controller;

import java.util.Map;

import org.greysalmon.model.Userr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/userr")
public class UserController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Map<String, Object> map) {
		// map.put("title", "User Registration");
		return "user/register";
	}

	// method for handling the user data
	@RequestMapping(value = "/details", method = RequestMethod.POST)
	public String detils(Userr userr, Map<String, Object> map) {

		// putting all values form the form to a map that will be passed to the
		// jsp
		map.put("fName", userr.getfName());
		map.put("lName", userr.getlName());
		map.put("email", userr.getEmail());
		map.put("mobile", userr.getMobile());
		
		return "user/details";
	}
}
