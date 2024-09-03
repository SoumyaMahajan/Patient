package com.hexaware.hospital;

public class Patient {

	  private int PatientID;
	  private String FirstName;
	  private String LastName;
	  private int Age;
	  private String Gender;
	  private String PhoneNumber;
	  private String Symptoms;
	  private String NatureOfVisit;
	  private String Email;
	  private String Password;
	  
	  
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
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
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getSymptoms() {
		return Symptoms;
	}
	public void setSymptoms(String symptoms) {
		Symptoms = symptoms;
	}
	public String getNatureOfVisit() {
		return NatureOfVisit;
	}
	public void setNatureOfVisit(String natureOfVisit) {
		NatureOfVisit = natureOfVisit;
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
		return "Patient [PatientID=" + PatientID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age="
				+ Age + ", Gender=" + Gender + ", PhoneNumber=" + PhoneNumber + ", Symptoms=" + Symptoms
				+ ", NatureOfVisit=" + NatureOfVisit + ", Email=" + Email + ", Password=" + Password + "]";
	}
	 	  
}
