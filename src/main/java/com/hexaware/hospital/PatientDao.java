package com.hexaware.hospital;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hexaware.hospital.EncryptPassword;
import com.hexaware.hospital.Patient;

public class PatientDao {

private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String insertPatientDao(Patient patient) {
		String pwd = EncryptPassword.getCode(patient.getPassword());
		patient.setPassword(pwd);
		String cmd = "Insert into Patient(patientID,firstName,lastName,age,gender,phoneNumber,symptoms,natureofVisit,email,password) "
				+ " values(?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {patient.getPatientID(), 
						patient.getFirstName(), patient.getLastName(), patient.getAge(),
						patient.getGender(), patient.getPhoneNumber(), patient.getSymptoms(),
						patient.getNatureOfVisit(), patient.getEmail(), patient.getPassword()
				});
		System.out.println("Patient Added Successfully");		
		return "Record Inserted...";
	}
}
