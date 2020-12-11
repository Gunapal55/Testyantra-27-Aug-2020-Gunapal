package com.tyss.bmd.dao;

import java.util.List;

import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.Patient;
import com.tyss.bmd.entity.Rating;


public interface PatientDAO {
	
	
	public Patient addPatient(Patient patient);
	
	public Patient updatePatient(Patient updatePatient);
	
	public Patient removePatient(String emailId);
	
	public Appointment bookAppointment(Appointment bookAppointment);
	
	public Appointment updateAppoitment(Appointment updateAppointment);
	
	public List<Doctor> viewAllDoctor(Doctor viewAllDoctor);
	
	public Rating giveRatings(Rating rating);
	
	
}
