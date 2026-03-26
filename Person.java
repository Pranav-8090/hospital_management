package com.hospital;

public class Person {
	protected int id;
	protected String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getid() {
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	public void role() {
		System.out.println("Person");
	}
	
	
}
