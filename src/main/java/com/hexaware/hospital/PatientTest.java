package com.hexaware.hospital;

import org.springframework.jdbc.core.JdbcTemplate;

public class PatientTest {

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
		System.out.println(patient);
		String cmd = "Insert into Patient(patientID,firstName,lastName,age,gender,phoneNumber,symptoms,natureofVisit,email,password) "
				+ " values(?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {patient.getPatientID(), 
						patient.getFirstName(), patient.getLastName(), patient.getAge(),
						patient.getGender(), patient.getPhoneNumber(), patient.getSymptoms(),
						patient.getNatureOfVisit(), patient.getEmail(), patient.getPassword()
				});
		//SendMail.mailSend("soumya.mmahajan@gmail.com", "New Doctor Added", "Hexaware Training");
		System.out.println("Patient Added Successfully");		
		return "Record Inserted...";
	}
}
