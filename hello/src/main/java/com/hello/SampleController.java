package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);

	}

	@RequestMapping("hi") // the mapping for the incoming request
	@ResponseBody
	String home(@RequestParam String name) { // the parameter for the request
		if (name!=null&&!name.equals("")) {
			return "Hello "+name+"!!!";
		}
		else {
			return "Hello Java Bootcamp!";
		}
	}
		@RequestMapping("logon")// the mapping for the incoming request
		@ResponseBody
		String logon (@RequestParam String userName, @RequestParam String password) {
			return "Logon attempted: uname = "+userName+", pwd = "+password;
		}

	}
