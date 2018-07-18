package org.greysalmon.controller;

import java.util.Map;

import org.greysalmon.model.Userr;
import org.greysalmon.service.UserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserrService userrService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Map<String, Object> map) {
		// map.put("title", "User Registration");

		// the data that will be created in the form should be back-up be the
		// entity thst's why we put this object to the map
		map.put("userr", new Userr());// the form backing object

		return "user/register";
	}
	
	// method for handling the request for the submission of the form
	// the method must match with the one defined in the form action
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Userr userr, Map<String, Object> map) {
		userrService.create(userr);
		System.out.println("user crud: create");
		map.put("userr", new Userr());
		
		// to avoid double submission (when client clicks few times submit button)
		return "redirect:/user/details/" + userr.getUserrId();
	}

	// method for handling the user data
	@RequestMapping(value = "/details/{userrId}", method = RequestMethod.GET)
	// PathVariable is used to get the userId form the redirected ULR 
	public String detils(@PathVariable("userrId") Long userrId, Map<String, Object> map) {
		Userr userr = new Userr();
		userr = userrService.find(userrId);		
		// putting all values form the form to a map that will be passed to the
		// jsp
		map.put("fName", userr.getfName());
		map.put("lName", userr.getlName());
		map.put("email", userr.getEmail());
		map.put("mobile", userr.getMobile());

		return "user/details";
	}
	
	@RequestMapping(value="/list", method= RequestMethod.GET)
	public String list(Map<String, Object> map){
		map.put("userrList", userrService.getAll());
		return "user/list";
	}
}
