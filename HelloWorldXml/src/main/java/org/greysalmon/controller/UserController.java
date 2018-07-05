package org.greysalmon.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@RequestMapping(value = "/user/register", method = RequestMethod.GET)
	public String register(Map<String, Object> map) {
		// map.put("title", "User Registration");
		return "user/register";
	}

	// method for handling the user data
	@RequestMapping(value = "/user/details", method = RequestMethod.POST)
	public String detils(@RequestParam("fName") String fName, @RequestParam("lName") String lName,
			@RequestParam("email") String email, @RequestParam("mobile") String mobile, Map<String, Object> map) {

		// putting all values form the form to a map that will be passed to the
		// jsp
		map.put("fName", fName);
		map.put("lName", lName);
		map.put("email", email);
		map.put("mobile", mobile);
		return "user/details";
	}
}
