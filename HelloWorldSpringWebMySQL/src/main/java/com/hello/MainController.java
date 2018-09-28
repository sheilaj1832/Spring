package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class MainController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/add")
	public @ResponseBody String addNewUser(@RequestParam String name, 
											@RequestParam String email) { //Responsebody the return string is the response it returns a JSON
		User u = new User();
		u.setName(name);
		u.setEmail(email);
		userRepository.save(u);
		return "Saved";
	}
	@GetMapping("/all")
	public @ResponseBody Iterable<User> getAllUsers() { //iterable is a list type. it is a replacement of list.
		return userRepository.findAll();
	}
	}

