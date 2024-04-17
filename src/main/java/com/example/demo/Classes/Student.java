package com.example.demo.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int student_id;
private String student_Name;
private String email;
private String mobile;
private String Board_name;
private String Batch_name;
private String student_class;
private String student_photo;
private String password;
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_Name() {
	return student_Name;
}
public void setStudent_Name(String student_Name) {
	this.student_Name = student_Name;
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
public String getBoard_name() {
	return Board_name;
}
public void setBoard_name(String board_name) {
	Board_name = board_name;
}
public String getBatch_name() {
	return Batch_name;
}
public void setBatch_name(String batch_name) {
	Batch_name = batch_name;
}
public String getStudent_class() {
	return student_class;
}
public void setStudent_class(String student_class) {
	this.student_class = student_class;
}
public String getStudent_photo() {
	return student_photo;
}
public void setStudent_photo(String student_photo) {
	this.student_photo = student_photo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "Student [student_id=" + student_id + ", student_Name=" + student_Name + ", email=" + email + ", mobile="
			+ mobile + ", Board_name=" + Board_name + ", Batch_name=" + Batch_name + ", student_class=" + student_class
			+ ", student_photo=" + student_photo + ", password=" + password + "]";
}

	
}
