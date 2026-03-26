package com.hospital;

public class Patient extends Person {
	private int age;
	private String name;
	
	public Patient(int id, String name, int age, String name2) {
		super(id, name);
		this.age = age;
		name = name2;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public void role() {
		// TODO Auto-generated method stub
		super.role();
		System.out.println("Patient");
	}
	
}
