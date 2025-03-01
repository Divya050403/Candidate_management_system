package com.Entity;

public class Candidate {
	private int c_id;
	private String c_Name;
	private String Assembly;
	private String Party_Name;
	private String State;
	private String Gender;
	private int Age;
	public Candidate() {
		super();
	}
	public Candidate(int c_id, String c_Name, String assembly, String party_Name, String state, String gender,
			int age) {
		super();
		this.c_id = c_id;
		this.c_Name = c_Name;
		Assembly = assembly;
		Party_Name = party_Name;
		State = state;
		Gender = gender;
		Age = age;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_Name() {
		return c_Name;
	}
	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}
	public String getAssembly() {
		return Assembly;
	}
	public void setAssembly(String assembly) {
		Assembly = assembly;
	}
	public String getParty_Name() {
		return Party_Name;
	}
	public void setParty_Name(String party_Name) {
		Party_Name = party_Name;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Candidate [c_Name=" + c_Name + ", Assembly=" + Assembly + ", Party_Name=" + Party_Name + "]";
	}
	
	
	

}
