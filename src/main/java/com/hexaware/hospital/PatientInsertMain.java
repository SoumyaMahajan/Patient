package com.hexaware.hospital;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientInsertMain {

	public static void main(String[] args) {
		Patient patient = new Patient();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient ID  ");
		patient.setPatientID(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Patient FirstName   ");
		patient.setFirstName(sc.nextLine());
		System.out.println("Enter Patient LastName   ");
		patient.setLastName(sc.nextLine());
		System.out.println("Enter Age  ");
		patient.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Gender  ");
		patient.setGender(sc.nextLine());
		System.out.println("Enter PhoneNumber  ");
		patient.setPhoneNumber(sc.nextLine());
		System.out.println("Enter Symptoms  ");
		patient.setSymptoms(sc.nextLine());
		System.out.println("Enter NatureOfVisit  ");
		patient.setNatureOfVisit(sc.nextLine());
		System.out.println("Enter Email  ");
		patient.setEmail(sc.nextLine());
		System.out.println("Enter Password  ");
		patient.setPassword(sc.nextLine());
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/hospital/jdbc.xml");
		PatientDao dao = (PatientDao)ctx.getBean("patientDao");
		System.out.println(dao.insertPatientDao(patient));
	}
}
