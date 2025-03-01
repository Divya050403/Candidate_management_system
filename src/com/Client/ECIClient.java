package com.Client;

import java.util.List;

import com.Controller.ECiController;
import com.Entity.Candidate;

public class ECIClient {
	public static void main(String[] args) {
		
	System.out.println("We are in Client");
	ECiController controller = null;
	
	controller = new ECiController();
	List<Candidate> allCandidates = controller.getAllCandidates();

}
}
