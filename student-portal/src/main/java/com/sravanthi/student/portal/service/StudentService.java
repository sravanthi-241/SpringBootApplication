package com.sravanthi.student.portal.service;

import java.util.List;

import com.sravanthi.student.portal.model.Student;

public interface StudentService {
	Student saveStudent(Student s);
	Student getStudent(Integer id);
	List<Student> getAllStudents();
	void deleteStudent(Integer id);
	Student updateStudent(Student id);

}
