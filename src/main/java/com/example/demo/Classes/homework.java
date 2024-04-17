package com.example.demo.Classes;

public class homework {
	private int id;
	private String teacher_name;
	private String board;
	private String teacher_class;
	private String batch;
	private String subject;
	private String pdf_file;
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
	public String getTeacher_class() {
		return teacher_class;
	}
	public void setTeacher_class(String teacher_class) {
		this.teacher_class = teacher_class;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPdf_file() {
		return pdf_file;
	}
	public void setPdf_file(String pdf_file) {
		this.pdf_file = pdf_file;
	}
	@Override
	public String toString() {
		return "homework [id=" + id + ", teacher_name=" + teacher_name + ", board=" + board + ", teacher_class="
				+ teacher_class + ", batch=" + batch + ", subject=" + subject + ", pdf_file=" + pdf_file + "]";
	}
	


}
