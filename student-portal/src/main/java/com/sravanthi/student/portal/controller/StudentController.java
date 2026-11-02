package com.sravanthi.student.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sravanthi.student.portal.model.Student;
import com.sravanthi.student.portal.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService  studentService;
	@GetMapping("hello")
	String hello() {
		return "Good Morning";
		
	}
	//http://localhost:9090/student/savestudent
	@PostMapping("/savestudent")
	Student createStudent(@RequestBody Student s) {
		return studentService.saveStudent(s);
	}
	//http://localhost:9090/student/getAllStudents
	@GetMapping("/getAllStudents")
	List<Student>getAllStudents(){
		return studentService.getAllStudents();
		
	}
	//http://localhost:9090/student/getStudent/7
	@GetMapping("getStudent/{sid}")
	Student getStudent(@PathVariable Integer sid) {
		return studentService.getStudent(sid);
	}
	//http://localhost:9090/student/updateStudent/6
	@PutMapping("updateStudent/{sid}")
	Student updateStudent(@PathVariable Integer sid ,@RequestBody Student s) {
		Student studentFromDB=getStudent(sid);
		studentFromDB.setAge(s.getAge());
		studentFromDB.setFirstname(s.getFirstname());
		studentFromDB.setLastname(s.getLastname());
		studentFromDB.setCity(s.getCity());
		studentFromDB.setTotalmarks(s.getTotalmarks());
		
		return studentService.updateStudent(studentFromDB);
	}
	//http://localhost:9090/student/deleteStudent/5
@DeleteMapping("deleteStudent/{sid}")
String deleteStudent(@PathVariable Integer sid) {
	studentService.deleteStudent(sid);
	return "deleted studented"+  sid  +"successfully";
}

}
