package com.tyss.bmd.service;

import java.util.List;

import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.Patient;
import com.tyss.bmd.entity.User;


public interface AdminService {

	public Doctor addDoctor(Doctor doctor);

	public Doctor removeDoctor(int id);

	public Patient removePatient(int id);

	public List<Appointment> viewAllAppointments(Appointment appointment);

	public Doctor updateDoctor(Doctor doctor);

	public Patient updatePatient(Patient patient);

	public List<Doctor> getAllDoctor();

	public List<Patient> getAllPatient();

	public Appointment removeAppointment(int appointmentId);
	
	public User getUser(String email);
	
	public User updateUser(User user);

}
