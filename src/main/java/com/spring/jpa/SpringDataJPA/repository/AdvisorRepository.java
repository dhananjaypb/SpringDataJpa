package com.spring.jpa.SpringDataJPA.repository;



import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.SpringDataJPA.model.Advisor;

public interface AdvisorRepository extends JpaRepository<Advisor,Long> {
	
	public Page<Advisor> findById(int id, Pageable p);
	public Page<Advisor> findByIdAndName(int id, String name, Pageable p);
	public Page<Advisor> findByIdAndDate(int id, Date date, Pageable p);
}
