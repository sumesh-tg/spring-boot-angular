package com.coder4u.student;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author Sumesh
 *
 */

public interface StudentDAO {
	public List<Student> retrieveAllStudents();

	public int insertStudents(Student student);

	public int updateStudents(Student student);

	public int deleteStudents(long studentID);
}
