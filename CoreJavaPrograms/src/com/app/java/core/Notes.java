package com.app.java.core;

public class Notes {

	private int id;
	private String Name;
	private String rollNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Notes [id=" + id + ", Name=" + Name + ", rollNo=" + rollNo + "]";
	}
	public Notes(int id, String name, String rollNo) {
		super();
		this.id = id;
		Name = name;
		this.rollNo = rollNo;
	}
	
}
