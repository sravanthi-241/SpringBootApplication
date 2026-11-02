package com.sravanthi.student.portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="student77")
@Setter
@Getter
public class Student {
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer sid;
	String firstname;
	String lastname;
	int age;
	double totalmarks;
	String city;
	

}
