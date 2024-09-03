package com.hexaware.hospital;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DoctorShowMain {

	  public static void main(String[] args) {
		  ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/hospital/jdbc.xml");
			DoctorDao dao = (DoctorDao)ctx.getBean("doctorDao");
			List<Doctor> doctorList = dao.showDoctorDao();
			for (Doctor doctor : doctorList) {
				System.out.println(doctor);
			}
	}
}
