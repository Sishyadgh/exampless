package com.example.demo.Controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Classes.BatchMaster;
import com.example.demo.Classes.BoardMaster;
import com.example.demo.Classes.ClassMaster;
import com.example.demo.Classes.Student;
import com.example.demo.Classes.SubjectMaster;
import com.example.demo.Classes.Teacher;
import com.example.demo.Classes.video;
import com.example.demo.service.BoardMasterService;
@Controller
public class SchoolController 
{
	
	@Autowired
	BoardMasterService bs;
	

	
	@GetMapping("/")
	public String Dashboard(ModelMap m) 
	{
		long totalBoard = bs.totalboardnumber();
		m.addAttribute("totalBoard", totalBoard);
		long totalBatch = bs.totalbatchnumber();
		m.addAttribute("totalBatch", totalBatch);
		long totalClass = bs.totalclassnumber();
		m.addAttribute("totalClass", totalClass);
		long totalSubject = bs.totalsubjectnumber();
		m.addAttribute("totalSubject", totalSubject);
		long totalteacher=bs.totalteachernumber();
		m.addAttribute("totalteacher", totalteacher);
		long totalvideos = bs.totalvideosnumber();
		m.addAttribute("totalvideos",totalvideos);
		
		return "Dashboard";

	}

	@GetMapping("/boardMaster")
	public String boardMaster(Model m) {
		List <BoardMaster> b= bs.getalldata();
		m.addAttribute("data",b);
			return "boardMaster";

	}
	
	@PostMapping("/board")
	public String board(@ModelAttribute("bm") BoardMaster b1)
	{
		bs.insert(b1);
		return "redirect:boardMaster";
		
	}
	
	@GetMapping("/edit")
   public String editBoard(@RequestParam("id") int id, ModelMap m) {
		BoardMaster b=bs.getdata(id);
		m.addAttribute("b",b);
	return "editBoard";
	   
   }
	
	@GetMapping("/del")
	public String del(@RequestParam("id") int id) {
		bs.delete(id);
		return "redirect:boardMaster";

	}
	
	
  
	@GetMapping("/batchMaster")
	public String batchMaster(Model m) {
		List <BatchMaster> bm= bs.getallbatch();
		m.addAttribute("batch",bm);
		return "batchMaster";
	}
	
	
	@GetMapping("/editb")
	   public String editbatch(@RequestParam("batch_id") int batch_id, ModelMap m) {
			BatchMaster bb= bs.getBatch(batch_id);
			m.addAttribute("bb",bb);
		return "editbatch";
		   
	   }
	
	@PostMapping("/batch")
	public String batch(@ModelAttribute("b2") BatchMaster b2)
	{
		bs.insertbatch(b2);
		return "redirect:batchMaster";
		
	}

	@GetMapping("/deleteb")
	public String deleteb(@RequestParam("batch_id") int batch_id) {
		bs.deletebatch(batch_id);
		return "redirect:batchMaster";

	}
	
	
	
	
	
	
	
	@GetMapping("/classMaster")
	public String classMaster(Model m) {
		List <ClassMaster> cm= bs.getallclass();
		m.addAttribute("cdata", cm);
		return "classMaster";
	}
		
	@PostMapping("/classs")
	public String classs(@ModelAttribute("c1") ClassMaster c1) {
		bs.insertclass(c1);
		return "redirect:classMaster";
	}
	
	@GetMapping("/editc")
	   public String editclass(@RequestParam("class_id") int class_id, ModelMap m) {
			ClassMaster cl = bs.getClass(class_id);
			m.addAttribute("cl",cl);
		return "editclass";
		   
	   }
	
	@PostMapping("/xyz")
	public String xyz(@ModelAttribute("c3") ClassMaster c3)
	{
		bs.insertclass(c3);
		return "redirect:classMaster";
		
	}
	

	@GetMapping("/deletec")
	public String deletec(@RequestParam("class_id") int class_id) {
		bs.deleteclass(class_id);
		return "redirect:classMaster";

	}
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/subjectMaster")
	public String subjectMaster(Model m) {
		List <SubjectMaster> sm=bs.getallsubject();
		m.addAttribute("sdata", sm);
		return "subjectMaster";		
	}
	
	@PostMapping("/subject")
	public String subject(@ModelAttribute("s1") SubjectMaster s1) {
		bs.insertsubject(s1);
		return "redirect:subjectMaster";
	}
		
		
		@GetMapping("/edits")
		   public String editSubject(@RequestParam("subject_id") int subject_id, ModelMap m) {
				SubjectMaster sm= bs.getSubject(subject_id);
				m.addAttribute("sm",sm);
			return "editSubject";
			   
		   }
		@GetMapping("/deletes")
		public String deletes(@RequestParam("subject_id") int subject_id) {
			bs.deletesubject(subject_id);
			return "redirect:subjectMaster";

		}
			
		
		
		
		
		
		
		
	
	@GetMapping("/totalTeachers")
	public String totalTeachers(Model m) {
		List <Teacher> t=bs.getallTeacher();
		m.addAttribute("data2", t);
		return "totalTeachers";	
	}
	
//	@PostMapping("/teacherr")
//	public String teacherr(@ModelAttribute("t1") Teacher t1) {
//		bs.insertteacher(t1);
//		return "redirect:totalTeachers";	
//	}
	
	@PostMapping("teacherr")
	public String teacherr(@RequestParam("filename") MultipartFile teacher_photo, @ModelAttribute("s") Teacher s )
	{
	    String path2="src/main/resources/static/uploads/teacher/";
		String filename=null;	 
		 try {
			filename = this.bs.UploadImage(path2, teacher_photo);
		} 
		 catch (IOException e) {
			
			e.printStackTrace();
		}
		
	        s.setTeacher_photo(filename);
		bs.insertteacher(s);
		return "redirect:/totalTeachers";
	}

	
	@GetMapping("/editt")
	   public String editTeacher(@RequestParam("teacher_id") int teacher_id, ModelMap m) {
			Teacher t= bs.getTeacher(teacher_id);
			m.addAttribute("t",t);
		return "editTeacher";		   
	   }
	
	@PostMapping("/teacher")
	public String teacher(@ModelAttribute("t3") Teacher t3)
	{
		bs.insertteacher(t3);
			return "redirect:totalTeachers";
		
	}
	@GetMapping("/delt")
	public String delt(@RequestParam("teacher_id") int teacher_id) {
		bs.deleteteacher(teacher_id);
		return "redirect:totalTeachers";

	}
	
	

	
	
	
	
	

	@GetMapping("/totalStudents")
	public String totalStudents(Model m) 
	{
		List<Student> l= bs.getallstudents();
		m.addAttribute("stu_data",l);
		return "totalStudents";
		
	}

	
	@PostMapping("/student")
	public String student(@RequestParam("studentfile") MultipartFile student_photo,@ModelAttribute("s1") Student s1) {
		 String path2="src/main/resources/static/uploads/student/";
		 String studentfile=null;	 
		 try {
			studentfile = this.bs.UploadImage1(path2, student_photo);
		} 
		 catch (IOException e) {
			
			e.printStackTrace();
		}       
		s1.setStudent_photo(studentfile);
		bs.insertstudent(s1);
		return "redirect:totalStudents";
		
	}
	
	@GetMapping("/studentedit")
	   public String editStudent(@RequestParam("student_id") int student_id, ModelMap m) {
			Student st= bs.getstudent(student_id);
			m.addAttribute("st",st);
		return "editStudent";		   
	   }
	
	@PostMapping("/studentupdate")
	public String studentupdate(@ModelAttribute("sc") Student sc) {
		bs.insertstudent(sc);
		return "redirect:totalStudents";
		
	}
	@GetMapping()
	public String deleteStudent(@RequestParam("student_id") int student_id) {
		bs.delete(student_id);
		return "redirect:/totalStudents";
		
	}
	
	
	
	
	
	
	@PostMapping("/video")
	public String video(@ModelAttribute("v1") video v1) {
		bs.insertvideo(v1);
		return "redirect:/totalVideos";
		
	}
	@GetMapping("/totalVideos")
	public String totalVideos(Model m)
	{
		List <video> v=bs.getvideos();
		m.addAttribute("vdata", v);
		return "totalVideos";	
		
	}
	@GetMapping("/editvideo")
	   public String editVideo(@RequestParam("id") int id, ModelMap m) {
		   video v= bs.getvideos(id);
			//BoardMaster b=bs.getdata(id);
			m.addAttribute("v",v);
		return "editVideo";
		   
	   }
	
	@PostMapping("/updatevideo")
	public String updatevideo(@ModelAttribute("bm") video v1)
	{
		bs.insertvideo(v1);
		return "redirect:/totalVideos";
		
	}

	@GetMapping("/deletevideo")
	public String deletevideo(@RequestParam("id") int id) {
		bs.deletevideo(id);
		return "redirect:/totalVideos";

	}
	

	
	
	
	
	
	
	
	
	
	@GetMapping("/addNewBoard")
	public String addNewBoard() {
		return "addNewBoard";
		
	}
	@GetMapping("/addNewBatch")
	public String addNewBatch() {
		return "addNewBatch";
		
	}
	@GetMapping("/addNewClass")
	public String addNewClass() {
		return "addNewClass";
		
	}
	@GetMapping("/addNewSubject")
	public String addNewSubject() {
		return "addNewSubject";
		
	}
	
	@GetMapping("/addNewTeacher")
	public String addNewTeacher() {
		return "addNewTeacher";
		
	}
	@GetMapping("/addNewStudent")
	public String addNewStudent() {
		return "addNewStudent";
		
	}
	
	
	
	@GetMapping("/addNewVideo")
	public String addNewVideo()
	
	{
		return "addNewVideo";
		
	}
	@GetMapping("/totalHomework")
	public String totalHomework()
	{
		return "totalHomework";
		
	}
	
	@GetMapping("/addNewHomework")
	public String addNewHomework()
	
	{
		return "addNewHomework";
		
	}
	
	
	
	
}
