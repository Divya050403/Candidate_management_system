package com.Controller;

import java.util.List;

import com.Entity.Candidate;
import com.Services.Service;

public class ECiController {
	Service service = null;
	
	public List<Candidate> getAllCandidates(){
		System.out.println("We are in Controller Layer.");
		service = new Service();
		List<Candidate> allCandidates = service.getAllCandidates();
		return null;
		

}
}
