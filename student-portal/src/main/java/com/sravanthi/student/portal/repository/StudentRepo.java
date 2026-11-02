package com.sravanthi.student.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sravanthi.student.portal.model.Student;

@Repository
public interface StudentRepo  extends JpaRepository<Student ,Integer>{
	

}
