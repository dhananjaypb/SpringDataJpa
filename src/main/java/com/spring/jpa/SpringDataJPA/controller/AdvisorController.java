package com.spring.jpa.SpringDataJPA.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring.jpa.SpringDataJPA.model.Advisor;
import com.spring.jpa.SpringDataJPA.repository.AdvisorRepository;

@RestController
public class AdvisorController {
	
	@Autowired
	private AdvisorRepository advisorRepository;
	
	@GetMapping(value="/get")
	public Page<Advisor> getById(@RequestParam int id, Pageable p, Sort s){
		if(id!=0)
			return advisorRepository.findById(id,p);
		else
		return  (Page<Advisor>) advisorRepository.findAll(p.getSort());
	}
	
	@GetMapping(value="/all/{id}")
	public Page<Advisor> getByIdAndName(@PathVariable int id , @RequestParam String name, Pageable p ){
		if(name.isEmpty())
			return advisorRepository.findById(id,  p);
		else
		return advisorRepository.findByIdAndName(id, name,  p);
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping(value="/call/{id}")
	public Page<Advisor> getByIdAndDate(@PathVariable int id ,@RequestParam (required=false)Date date, Pageable p){
		if(date== null){	
		Date currentdate = new Date() ;
		currentdate.setDate(currentdate.getDate()-1);
		System.out.println(currentdate);
		return advisorRepository.findByIdAndDate(id, currentdate,  p);
		}else{
		System.out.println(date);
		return	advisorRepository.findByIdAndDate(id, date,  p);
		}
	}
}
	
