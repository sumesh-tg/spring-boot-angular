package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	 public Object testRest(){
		Map<String,String> mapTest=new HashMap<>();
		mapTest.put("1", "data1");
		mapTest.put("2", "data2");
		mapTest.put("3", "data3");
		mapTest.put("4", "data4");
		mapTest.put("5", "data5");
		return mapTest;
	}

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public void infoService() {
		System.out.println("Test service call ..................");
	}

	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public void checkService() {
		System.out.println("Test service call ..................");
	}
	@GetMapping("getMap")
	public void getTest(){
		System.out.println("calleddd");
	}
}
