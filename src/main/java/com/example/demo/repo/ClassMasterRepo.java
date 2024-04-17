package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Classes.ClassMaster;
@Repository
public interface ClassMasterRepo extends JpaRepository<ClassMaster,Integer>{

}
