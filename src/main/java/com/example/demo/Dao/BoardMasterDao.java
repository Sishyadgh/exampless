package com.example.demo.Dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Classes.BatchMaster;
import com.example.demo.Classes.BoardMaster;
import com.example.demo.Classes.ClassMaster;
import com.example.demo.Classes.Student;
import com.example.demo.Classes.SubjectMaster;
import com.example.demo.Classes.Teacher;
import com.example.demo.Classes.homework;
import com.example.demo.Classes.video;
import com.example.demo.repo.BatchMasterRepo;
import com.example.demo.repo.BoardMasterRepo;
import com.example.demo.repo.ClassMasterRepo;
import com.example.demo.repo.StudentRepo;
import com.example.demo.repo.SubjectMasterRepo;
import com.example.demo.repo.TeacherRepo;
import com.example.demo.repo.homeworkRepo;
import com.example.demo.repo.videoRepo;
import com.example.demo.service.BoardMasterService;

@Service
public class BoardMasterDao implements BoardMasterService {

	@Autowired
	BoardMasterRepo br;
	@Autowired
	BatchMasterRepo btr;
	@Autowired
	ClassMasterRepo cr;
	@Autowired
	SubjectMasterRepo sr;
	@Autowired
	TeacherRepo tr;
	@Autowired
	StudentRepo str;
	@Autowired
	videoRepo vr;
	@Autowired
	homeworkRepo hr;
	
	// Board Master 
	@Override
	public String UploadImage(String path, MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		String filename=file.getOriginalFilename();
		String randomID=UUID.randomUUID().toString();
		String fileName2 = randomID.concat(filename.substring(filename.lastIndexOf(".")));
		String filepath=path+File.separator+fileName2;
		File f=new File(path);
		if(!f.exists())
		{
			f.mkdir();
		}			                                                          	
		Files.copy(file.getInputStream(),Paths.get(filepath));
		return fileName2;

	}

//	@Override
//	public String UploadImage(String path, MultipartFile file) throws IOException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public void insert(BoardMaster b) {
		// TODO Auto-generated method stub
		br.save(b);
	}


	@Override
	public List<BoardMaster> getalldata() {
		// TODO Auto-generated method stub
		return br.findAll();
	}


	@Override
	public BoardMaster getdata(int id) {
		// TODO Auto-generated method stub
		BoardMaster b= br.getById(id);
		return b;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		br.deleteById(id);
	}


	@Override
	public long totalboardnumber() {
		// TODO Auto-generated method stub
		return br.count();
	}


	@Override
	public void insertbatch(BatchMaster bt) {
		// TODO Auto-generated method stub
		btr.save(bt);
	}


	@Override
	public void insertclass(ClassMaster c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}


	@Override
	public void insertsubject(SubjectMaster s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}


	@Override
	public void insertteacher(Teacher t) {
		// TODO Auto-generated method stub
		tr.save(t);
	}


	@Override
	public List<BatchMaster> getallbatch() {
		// TODO Auto-generated method stub
		 return btr.findAll();
	}


	@Override
	public List<ClassMaster> getallclass() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}


	@Override
	public List<SubjectMaster> getallsubject() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}


	@Override
	public List<Teacher> getallTeacher() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}


	@Override
	public BatchMaster getBatch(int batch_id) {
		// TODO Auto-generated method stub
		BatchMaster bm=btr.getById(batch_id);
		return bm;
	}


	@Override
	public ClassMaster getClass(int class_id) {
		// TODO Auto-generated method stub
		ClassMaster cs=cr.getById(class_id);
		return cs;
	}


	@Override
	public SubjectMaster getSubject(int subject_id) {
		// TODO Auto-generated method stub
		SubjectMaster sm=sr.getById(subject_id);
		return sm;
	}


	@Override
	public void deletebatch(int batch_id) {
		// TODO Auto-generated method stub
		btr.deleteById(batch_id);
	}


	@Override
	public void deleteclass(int class_id) {
		// TODO Auto-generated method stub
		cr.deleteById(class_id);
	}


	@Override
	public void deletesubject(int subject_id) {
		// TODO Auto-generated method stub
		sr.deleteById(subject_id);
	}


	@Override
	public long totalbatchnumber() {
		// TODO Auto-generated method stub
		return btr.count();
	}


	@Override
	public long totalclassnumber() {
		// TODO Auto-generated method stub
		return cr.count();
	}


	@Override
	public long totalsubjectnumber() {
		// TODO Auto-generated method stub
		return sr.count();
	}


	@Override
	public Teacher getTeacher(int teacher_id) {
		// TODO Auto-generated method stub
		Teacher t= tr.getById(teacher_id);
		return t;
	}


	@Override
	public void deleteteacher(int teacher_id) {
		// TODO Auto-generated method stub
		tr.deleteById(teacher_id);
		
	}


	@Override
	public long totalteachernumber() {
		// TODO Auto-generated method stub
		return tr.count();
	}

	@Override
	public void insertstudent(Student s) {
		// TODO Auto-generated method stub
		str.save(s);
	}

	@Override
	public List<Student> getallstudents() {
		// TODO Auto-generated method stub
		return str.findAll();
	}

	@Override
	public Student getstudent(int student_id) {
		// TODO Auto-generated method stub
		Student s=str.getById(student_id);
		return s;
	}

	@Override
	public void deletestudent(int student_id) {
		// TODO Auto-generated method stub
	  str.deleteById(student_id);
		
	}

	@Override
	public String UploadImage1(String path, MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		String studentfile=file.getOriginalFilename();
		String randomID=UUID.randomUUID().toString();
		String fileName2 = randomID.concat(studentfile.substring(studentfile.lastIndexOf(".")));
		String filepath=path+File.separator+fileName2;
		File f=new File(path);
		if(!f.exists())
		{
			f.mkdir();
		}			                                                          	
		Files.copy(file.getInputStream(),Paths.get(filepath));
		return fileName2;
	}

	@Override
	public void insertvideo(video v) {
		// TODO Auto-generated method stub
		vr.save(v);
		
	}

	@Override
	public List<video> getvideos() {
		// TODO Auto-generated method stub
		
		return vr.findAll();
	}

	@Override
	public video getvideos(int id) {
		// TODO Auto-generated method stub
		video v = vr.getById(id);
		return v;
	}

	@Override
	public void deletevideo(int id) {
		// TODO Auto-generated method stub
		vr.deleteById(id);
	}

	@Override
	public long totalvideosnumber() {
		// TODO Auto-generated method stub
		return vr.count();
	}

	@Override
	public void inserthomework(homework h) {
		// TODO Auto-generated method stub
		hr.save(h);
		
	}

	

	


	

	
	}


	


	


	

	


	


	


	
    
	

