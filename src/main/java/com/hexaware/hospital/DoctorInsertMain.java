package com.hexaware.hospital;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DoctorInsertMain {

	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor ID  ");
		doctor.setDoctorID(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor FirstName   ");
		doctor.setFirstName(sc.nextLine());
		System.out.println("Enter LastName   ");
		doctor.setLastName(sc.nextLine());
		System.out.println("Enter Speciality  ");
		doctor.setSpeciality(sc.nextLine());
		System.out.println("Enter Experience  ");
		doctor.setExperience(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Qualification  ");
		doctor.setQualification(sc.nextLine());
		System.out.println("Enter PhoneNumber  ");
		doctor.setPhoneNumber(sc.nextLine());
		System.out.println("Enter Email  ");
		doctor.setEmail(sc.nextLine());
		System.out.println("Enter Password  ");
		doctor.setPassword(sc.nextLine());
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/hospital/jdbc.xml");
		DoctorDao dao = (DoctorDao)ctx.getBean("doctorDao");
		System.out.println(dao.insertDoctorDao(doctor));
	}
}
