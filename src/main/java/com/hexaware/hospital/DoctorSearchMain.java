package com.hexaware.hospital;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DoctorSearchMain {

	public static void main(String[] args) {
		String speciality;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor Speciality   ");
		speciality = sc.next();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/hospital/jdbc.xml");
		DoctorDao dao = (DoctorDao)ctx.getBean("doctorDao");
		Doctor doctor = dao.searchDoctorDao(speciality);
		if (doctor!=null) {
			System.out.println(doctor);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}