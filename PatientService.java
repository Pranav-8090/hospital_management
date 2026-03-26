package com.hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientService implements HospitalService {

    private ArrayList<Patient> patients = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        patients.add(new Patient(id, name, age, disease));
        System.out.println("Patient added successfully!");
    }

    @Override
    public void viewAll() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient p : patients) {
        	System.out.println(p.getid() + "  |  " + p.getName() + " | " + p.getAge() + " | ");
        }
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
}