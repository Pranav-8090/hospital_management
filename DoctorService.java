package com.hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorService implements HospitalService{
	
	private ArrayList<Doctor> doctors = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void add() {
		System.out.println("Enter Doctor ID:   ");
		int id = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter Doctor Name:  ");
		String name = sc.nextLine();
		
		System.out.println("Enter Specialization: ");
		String spec = sc.nextLine();
		
		doctors.add(new Doctor(id,name,spec));
		System.out.println("Doctor added successfully!: ");
	}
	
	@Override
	public void viewAll() {
		if(doctors.isEmpty() ) {
			System.out.println("No doctors found: ");
			return;
		}
		
		for(Doctor d: doctors) {
			System.out.println(d.getid() + " | " + d.getname() + " | " + d.getSpecialization());
		}	
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	
}
