package com.sumesh.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value = "test", method = RequestMethod.GET)
    public Object testRest(){
		return "hii";
	}
}
