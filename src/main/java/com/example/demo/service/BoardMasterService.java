package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Classes.BatchMaster;
import com.example.demo.Classes.BoardMaster;
import com.example.demo.Classes.ClassMaster;
import com.example.demo.Classes.Student;
import com.example.demo.Classes.SubjectMaster;
import com.example.demo.Classes.Teacher;
import com.example.demo.Classes.homework;
import com.example.demo.Classes.video;

public interface BoardMasterService {
	
 void insert(BoardMaster b);
 List <BoardMaster> getalldata();
 BoardMaster getdata(int id);
 void delete(int id);
 long totalboardnumber();
 
 
 void insertbatch(BatchMaster bt);
 List <BatchMaster> getallbatch();
 BatchMaster getBatch(int batch_id);
 void deletebatch(int batch_id);
long totalbatchnumber();
 
 
 
 
 void insertclass(ClassMaster c);
 List <ClassMaster> getallclass();
 ClassMaster getClass(int class_id);
 void deleteclass(int class_id);
long totalclassnumber();
 
 
 void insertsubject(SubjectMaster s);
 List <SubjectMaster> getallsubject();
 SubjectMaster getSubject(int subject_id);
 void deletesubject(int subject_id);
long totalsubjectnumber();

 
 
 
 void insertteacher(Teacher t);
 List <Teacher> getallTeacher();
 Teacher getTeacher(int teacher_id);
 void deleteteacher(int teacher_id);
 long totalteachernumber();
 String UploadImage(String path, MultipartFile file) throws IOException;


 void insertstudent(Student s);
 List<Student> getallstudents();
 Student getstudent( int student_id);
 void deletestudent(int student_id);
 String UploadImage1(String path,MultipartFile file) throws IOException;
 
 void insertvideo(video v);
 List<video> getvideos();
 video getvideos(int id);
 void deletevideo(int id);
 long totalvideosnumber();
 
 void inserthomework(homework h);
 
 

}

