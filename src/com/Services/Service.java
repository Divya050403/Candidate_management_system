package com.Services;

import java.util.List;

import com.Dao.Dao;
import com.Entity.Candidate;

public class Service {
	Dao dao = null;
	public List<Candidate> getAllCandidates(){
		System.out.println("We are in Service Layer.");
		dao = new Dao();
		List<Candidate> allCandidates = dao.getAllCandidates();
		return null;
		
}
}
