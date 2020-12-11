package com.tyss.bmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.bmd.dao.PatientDAO;
import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.Patient;
import com.tyss.bmd.entity.Rating;
import com.tyss.bmd.exception.BookMyDoctorException;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO patientdao;

	@Override
	public Patient addPatient(Patient patient) {

		return patientdao.addPatient(patient);
	}


	@Override
	public Patient removePatient(String emailId) {
		
		Patient remove=patientdao.removePatient(emailId);
		
	if(remove!=null) {
		return remove;
	}else {
		throw new BookMyDoctorException("Patient is already removed");
	}
	
	}

	@Override
	public Appointment bookAppointment(Appointment bookAppointment) {

		Appointment app =patientdao.bookAppointment(bookAppointment);
	return app;
	}

public Patient updatePatient(Patient patient) {
		
		Patient updatePatient = patientdao.updatePatient(patient);
		if(updatePatient!=null) {
			return updatePatient;
		} else {
			throw new BookMyDoctorException("Unable to update patient");
		}
	}
	
	
	@Override
	public Appointment updateAppoitment(Appointment updateAppointment) {

		Appointment updateApp = patientdao.updateAppoitment(updateAppointment);
		if(updateApp==null) {
			return updateApp;
		}else {
			throw new BookMyDoctorException("Appoint is not yet booked");
		}

	}

	@Override
	public List<Doctor> viewAllDoctor(Doctor viewAllDoctor) {

		List<Doctor> docs =patientdao.viewAllDoctor(viewAllDoctor);
		
		if(docs!=null) {
			return docs;
			
		}else {
			throw new BookMyDoctorException("No match doctors found!");
		}
		
	}

	@Override
	public Rating giveRatings(Rating rating) {

	Rating giveRating = patientdao.giveRatings(rating);
	if(giveRating!=null) {
		return giveRating;
	}else {
		throw new BookMyDoctorException("Please give ratings");
	}
	
	}

}
