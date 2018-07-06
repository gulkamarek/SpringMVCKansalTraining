package org.greysalmon.controller;

import java.util.Map;

import org.greysalmon.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Map<String, Object> map) {
		// map.put("title", "User Registration");
		return "user/register";
	}

	// method for handling the user data
	@RequestMapping(value = "/details", method = RequestMethod.POST)
	public String detils(User user, Map<String, Object> map) {

		// putting all values form the form to a map that will be passed to the
		// jsp
		map.put("fName", user.getfName());
		map.put("lName", user.getlName());
		map.put("email", user.getEmail());
		map.put("mobile", user.getMobile());
		return "user/details";
	}
}
