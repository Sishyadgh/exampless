package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Classes.BatchMaster;
@Repository
public interface BatchMasterRepo extends JpaRepository <BatchMaster,Integer>{

}
