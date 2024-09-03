package com.hexaware.hospital;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hexaware.hospital.EncryptPassword;
import com.hexaware.hospital.Doctor;

public class DoctorDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Doctor> showDoctorDao() {
		String cmd = "select * from Doctor";
		List<Doctor> doctorList = jdbcTemplate.query(cmd, new RowMapper<Doctor>() {

			@Override
			public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
				Doctor doctor = new Doctor();
				doctor.setDoctorID(rs.getInt("doctorID"));
				doctor.setFirstName(rs.getString("firstName"));
				doctor.setLastName(rs.getString("lastName"));
				doctor.setSpeciality(rs.getString("speciality"));
				doctor.setExperience(rs.getInt("experience"));
				doctor.setQualification(rs.getString("qualification"));
				doctor.setPhoneNumber(rs.getString("phoneNumber"));
				doctor.setEmail(rs.getString("email"));
				doctor.setPassword(rs.getString("password"));
				// TODO Auto-generated method stub
				return doctor;
			}
		});
		return doctorList;
	}
	
	public Doctor searchDoctorDao(String speciality) {
		String cmd = "select * from doctor where speciality = ?";
		List<Doctor> doctorList = jdbcTemplate.query(cmd, new Object[] {speciality}, new RowMapper<Doctor>() {

			@Override
			public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
				Doctor doctor = new Doctor();
				doctor.setDoctorID(rs.getInt("doctorID"));
				doctor.setFirstName(rs.getString("firstName"));
				doctor.setLastName(rs.getString("lastName"));
				doctor.setSpeciality(rs.getString("speciality"));
				doctor.setExperience(rs.getInt("experience"));
				doctor.setQualification(rs.getString("qualification"));
				doctor.setPhoneNumber(rs.getString("phoneNumber"));
				doctor.setEmail(rs.getString("email"));
				doctor.setPassword(rs.getString("password"));
				// TODO Auto-generated method stub
				return doctor;
     		}
		});
		
		if (doctorList.size() == 0) {
			return null;
		}
		return doctorList.get(0);
	}
	
	public String insertDoctorDao(Doctor doctor) {
		String pwd = EncryptPassword.getCode(doctor.getPassword());
		doctor.setPassword(pwd);
		String cmd = "Insert into Doctor(doctorID,firstName,lastName,speciality,experience,qualification,phoneNumber,email,password) "
				+ " values(?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {doctor.getDoctorID(), 
						doctor.getFirstName(), doctor.getLastName(), doctor.getSpeciality(),
						doctor.getExperience(), doctor.getQualification(), doctor.getPhoneNumber(),
						doctor.getEmail(), doctor.getPassword()
				});
		SendMail.mailSend("soumya.mmahajan@gmail.com", "New Doctor Added", "Hexaware Training");
		System.out.println("Doctor Added Successfully");		
		return "Record Inserted...";
	}
	
}
