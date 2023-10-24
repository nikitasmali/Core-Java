package com.demo.filedemo;

public class Student1
{
	private String studentName;
	
	private Address address;
	
	public Student1()
	{
		this("ABC", new Address());
	}
	public Student1(String studentName, Address address)
	{
		this.studentName=studentName;
		this.address=address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "Name:"+studentName+"\n"+address;
	}
}
