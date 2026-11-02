package com.sravanthi.student.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sravanthi.student.portal.model.Student;
import com.sravanthi.student.portal.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student s) {
		
		return  studentRepo.save(s);
	}

	@Override
	public Student getStudent(Integer id) {
		
		return studentRepo.findById(id).orElseThrow();
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		
		studentRepo.deleteById(id);
	}

	@Override
	public Student updateStudent(Student s) {
		
		return studentRepo.save(s);
	}

}
