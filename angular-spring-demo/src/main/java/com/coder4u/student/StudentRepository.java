package com.coder4u.student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface StudentRepository extends CrudRepository<Student, Long> {
	List<Student> findByName(String name);
}
