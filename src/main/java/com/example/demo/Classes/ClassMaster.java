package com.example.demo.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassMaster {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	private int class_id;
	private String class_name;
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	
}
