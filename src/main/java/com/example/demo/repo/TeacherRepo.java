package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Classes.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer>{

}
