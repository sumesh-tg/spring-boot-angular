package com.coder4u.student;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author Sumesh
 *
 */
@Repository
public class StudentIMPL implements StudentDAO{ 
	@Override
	public List<Student> retrieveAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertStudents(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudents(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudents(long studentID) {
		// TODO Auto-generated method stub
		return 0;
	}

}
