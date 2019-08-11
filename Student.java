package com.nucleus;

public class Student {

	
	private String studentid;
	private String studentname;
	private Address address;
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(String studentid, String studentname, Address address) {
		
		this.studentid = studentid;
		this.studentname = studentname;
		this.address = address;
	}
	
	
	
	
}
