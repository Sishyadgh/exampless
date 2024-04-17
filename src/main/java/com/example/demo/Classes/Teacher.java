package com.example.demo.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private int teacher_id;
 private String teacher_name;
 private String email;
 private String mobile;
 private String subject;
 private String teacher_photo;
 private String address;
 private String Password;
public int getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(int teacher_id) {
	this.teacher_id = teacher_id;
}
public String getTeacher_name() {
	return teacher_name;
}
public void setTeacher_name(String teacher_name) {
	this.teacher_name = teacher_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getTeacher_photo() {
	return teacher_photo;
}
public void setTeacher_photo(String teacher_photo) {
	this.teacher_photo = teacher_photo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
@Override
public String toString() {
	return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", email=" + email + ", mobile="
			+ mobile + ", subject=" + subject + ", teacher_photo=" + teacher_photo + ", address=" + address
			+ ", Password=" + Password + "]";
}
 
}
