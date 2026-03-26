package com.hospital;

public class Appointment {
	
	private int appointment;			//is-A --> extends    HAS-A ---> object reference
	private Doctor doctor;
	private Patient patient;
	
	public Appointment(int appointment, Doctor doctor, Patient patient) {
		super();
		this.appointment = appointment;
		this.doctor = doctor;
		this.patient = patient;
	}

	public int getAppointment() {
		return appointment;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Patient getPatient() {
		return patient;
	}	
	
}
