package com.example.demo.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class video {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String teacher_name;
	private String board;
	private String batch;
	private String teacher_class;
	private String teacher_subject;
	private String video_link;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getTeacher_class() {
		return teacher_class;
	}
	public void setTeacher_class(String teacher_class) {
		this.teacher_class = teacher_class;
	}
	public String getTeacher_subject() {
		return teacher_subject;
	}
	public void setTeacher_subject(String teacher_subject) {
		this.teacher_subject = teacher_subject;
	}
	public String getVideo_link() {
		return video_link;
	}
	public void setVideo_link(String video_link) {
		this.video_link = video_link;
	}
	@Override
	public String toString() {
		return "video [id=" + id + ", teacher_name=" + teacher_name + ", board=" + board + ", batch=" + batch
				+ ", teacher_class=" + teacher_class + ", teacher_subject=" + teacher_subject + ", video_link="
				+ video_link + "]";
	}


}
