package com.tyss.bmd.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.bmd.dao.DoctorDAO;
import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.DoctorAvailability;
import com.tyss.bmd.entity.DueDays;
import com.tyss.bmd.entity.Rating;
import com.tyss.bmd.entity.User;
import com.tyss.bmd.exception.BookMyDoctorException;


@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDAO doctordao;

	@Override
	public Doctor addDoctor(Doctor doctor) {

		Doctor addDoc = doctordao.addDoctor(doctor);
		if (addDoc != null) {
			return addDoc;
		} else {
			throw new BookMyDoctorException("Your profile is already created");
		}
	}
		@Override
		public Doctor updateDoctor(Doctor doctor) {

		Doctor upDoc = doctordao.updateDoctor(doctor);
		if (upDoc != null) {
			return upDoc;
		} else {
			throw new BookMyDoctorException("Please creat your profile");
		}
	}

	@Override
	public Doctor removeDoctor(int doctorId) {

		Doctor docRemove = doctordao.removeDoctor(doctorId);
		if (docRemove != null) {
			return docRemove;
		} else {
			throw new BookMyDoctorException("Doctor is already removed");
		}
	}

	@Override
	public List<Rating> getAllRating(Rating allRating) {

		List<Rating> allRat = doctordao.getAllRating(allRating);
		if (allRat != null) {
			return allRat;
		} else {
			throw new BookMyDoctorException("No ratings are provided");
		}
	}

	@Override
	public List<Appointment> getAllScheduledAppointment(Appointment allAppointments) {

		List<Appointment> appo = doctordao.getAllScheduledAppointment(allAppointments);
		if (appo != null) {
			return appo;
		} else {
			throw new BookMyDoctorException("No scheduled appoints found");
		}
	}

	@Override
	public DoctorAvailability addAvailbility(DoctorAvailability avaible) {

		DoctorAvailability ava = doctordao.addAvailbility(avaible);
		return ava;
	}

	
	@Override
	public DoctorAvailability updateAvialbility(DoctorAvailability avaibility) {

		DoctorAvailability upAva = doctordao.updateAvialbility(avaibility);
		if (upAva == null) {
			return upAva;
		} else {
			throw new BookMyDoctorException("Updated successfully");
		}
	}
	
	
	@Override
	public Doctor getDoc(User user) {
		
		Doctor dto = doctordao.getDoc(user);
		if(dto!=null) {
			return dto;
		}else {
			throw new BookMyDoctorException("Profile not found");
		}
		
	}
	
	@Override
	public List<DueDays> updateDueDays(Date dueDaysFrom, Date dueDaysTo) {

		List<DueDays> upDue = doctordao.updateDueDays(dueDaysFrom, dueDaysTo);
		if (upDue != null) {
			return upDue;
		} else {
			throw new BookMyDoctorException("DueDays already exists");
		}
	}
	

}