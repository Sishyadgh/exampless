package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Classes.video;

@Repository
public interface videoRepo extends JpaRepository<video,Integer>{
	
	

}
