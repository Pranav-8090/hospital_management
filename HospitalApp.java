package com.hospital;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			DoctorService doctorService = new DoctorService();
			PatientService patientService = new PatientService();

			while (true) {
			    System.out.println("\n--- Hospital Management System ---");
			    System.out.println("1. Add Doctor");
			    System.out.println("2. View Doctors");		
			    System.out.println("3. Add Patient");
			    System.out.println("4. View Patients");
			    System.out.println("5. Exit");

			    System.out.print("Enter choice: ");
			    int choice = sc.nextInt();

			    switch (choice) {
			        case 1 -> doctorService.add();
			        case 2 -> doctorService.viewAll();
			        case 3 -> patientService.add();
			        case 4 -> patientService.viewAll();
			        case 5 -> {
			            System.out.println("Thank you!");
			            System.exit(0);
			        }
			        default -> System.out.println("Invalid choice!");
			    }
			}
		}
    }
}
