package com.tyss.bmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.bmd.dao.AdminDAO;
import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.Patient;
import com.tyss.bmd.entity.User;
import com.tyss.bmd.exception.BookMyDoctorException;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDAO admindao;
	
	@Override
	public Doctor addDoctor(Doctor doctor) {
	
		Doctor addDoc = admindao.addDoctor(doctor);
		if (addDoc == null) {
			return addDoc;
		} else {
			throw new BookMyDoctorException("Doctor record already exists");
		}
	}

	@Override
	public Doctor removeDoctor(int id) {
		
		Doctor remDoc = admindao.removeDoctor(id);
		if (remDoc != null) {
			return remDoc;

		} else {
			throw new BookMyDoctorException("No doctor record found to remove");
		}
	}

	@Override
	public Patient removePatient(int id) {
	
		Patient remPat = admindao.removePatient(id);
		if (remPat != null) {
			return remPat;

		} else {
			throw new BookMyDoctorException("No patient record found to remove");
		}
}

	@Override
	public List<Appointment> viewAllAppointments(Appointment appointment) {
	
		List<Appointment> allAppo = admindao.viewAllAppointments(appointment);
		if (allAppo!= null) {
			return allAppo;

		} else {
			throw new BookMyDoctorException("No appointments found");
		}
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
	
		Doctor updDoc = admindao.updateDoctor(doctor);
			if (updDoc != null) {

				return updDoc;

			} else {
				throw new BookMyDoctorException("No matching profile found to update");

			}
	}

	@Override
	public Patient updatePatient(Patient patient) {
	
		Patient updPat = admindao.updatePatient(patient);
		if (updPat != null) {

			return updPat;

		} else {
			throw new BookMyDoctorException("No matching patient record found for update");

		}
	}

	@Override
	public List<Doctor> getAllDoctor() {
	
		List<Doctor> docList = admindao.getAllDoctor();
		if (docList!=null) {

			return docList;

		} else {
			throw new BookMyDoctorException("No doctors found");

		}				
	}

	@Override
	public List<Patient> getAllPatient() {
	
		 List<Patient> patList = admindao.getAllPatient();
		if (patList!=null) {

			return patList;

		} else {
			throw new BookMyDoctorException("No patients found");

		}	
		}
	

	@Override
	public Appointment removeAppointment(int appointmentId) {
	
		Appointment remAppo = admindao.removeAppointment(appointmentId);
		if (remAppo!=null) {

			return remAppo;

		} else {
			throw new BookMyDoctorException("No appoiments found to remove");

		}
	}

	@Override
	public User getUser(String email) {
		User use = admindao.getUser(email);
		if(use!=null) {
			return use;
		}else {
			throw new BookMyDoctorException("No matching user found");
		}
	}

	@Override
	public User updateUser(User user) {
		User use = admindao.updateUser(user);
		if(use!=null) {
			return use;
		}else {
			throw new BookMyDoctorException("No matching user found");
		}
			
	}
}
