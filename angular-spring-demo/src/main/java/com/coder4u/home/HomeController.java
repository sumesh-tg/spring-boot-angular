package com.coder4u.home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coder4u.student.Student;
import com.coder4u.student.StudentDAO;
import com.coder4u.student.StudentRepository;

@RestController
@RequestMapping("api")
public class HomeController {
	/*
	 * @Autowired StudentDAO repository;
	 */
	@Autowired
	StudentRepository studentRepository;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public Object testRest() {
		Student student1 = new Student(Long.valueOf(0), "Sumesh", "RN1000001");
		Student student2 = new Student(Long.valueOf(0), "Rajesh", "RN1000001");
		Student student3 = new Student(Long.valueOf(0), "Manu", "RN1000001");
		Student student4 = new Student(Long.valueOf(0), "Muthu", "RN1000001");
		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);
		studentRepository.findAll();
		Map<String, String> mapTest = new HashMap<>();
		mapTest.put("1", "data1");
		mapTest.put("2", "data2");
		mapTest.put("3", "data3");
		mapTest.put("4", "data4");
		mapTest.put("5", "data5");
		List<Student> list=new ArrayList<>();
		list=(List<Student>) studentRepository.findAll();
		logger.info("Test logger",list);
		return list;
	}

	@RequestMapping(value = "info", method = RequestMethod.GET)
	public Object getInfo() {
		Map<String, String> mapTest = new HashMap<>();
		mapTest.put("1", "data1");
		mapTest.put("2", "data2");
		mapTest.put("3", "data3");
		mapTest.put("4", "data4");
		mapTest.put("5", "data5");
		return mapTest;
	}
	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello world! >>> Message from <a href='https://grokonez.com' target='_blank'>grokonez.com</a>";
	}
}
