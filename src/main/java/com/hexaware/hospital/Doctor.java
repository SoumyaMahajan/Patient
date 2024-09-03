package com.hexaware.hospital;

public class Doctor {

	  private int DoctorID;
	  private String FirstName;
	  private String LastName;
	  private String Speciality;
	  private int Experience;
	  private String Qualification;
	  private String PhoneNumber;
	  private String Email;
	  private String Password;
	  
	  
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	@Override
	public String toString() {
		return "Doctor [DoctorID=" + DoctorID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Speciality="
				+ Speciality + ", Experience=" + Experience + ", Qualification=" + Qualification + ", PhoneNumber="
				+ PhoneNumber + ", Email=" + Email + ", Password=" + Password + "]";
	}
	  	  	  
}
