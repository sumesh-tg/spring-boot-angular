package com.coder4u.home;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coder4u.student.Student;
import com.coder4u.student.StudentDAO;
import com.coder4u.student.StudentRepository;

@RestController
public class HomeController {
	/*@Autowired
	StudentDAO repository;*/
	@Autowired
	StudentRepository studentRepository;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public Object testRest() {
		Student  student=new Student(Long.valueOf(0),"Sumesh","RN1000001");
		studentRepository.save(student);
		studentRepository.findAll();
		Map<String, String> mapTest = new HashMap<>();
		mapTest.put("1", "data1");
		mapTest.put("2", "data2");
		mapTest.put("3", "data3");
		mapTest.put("4", "data4");
		mapTest.put("5", "data5");
		return studentRepository.findAll();
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
}
