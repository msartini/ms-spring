package com.infraascode.hrworker.repositories;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infraascode.hrworker.entities.Tutorial;
import com.infraascode.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	List<Tutorial> findByNameContaining(String name);
}