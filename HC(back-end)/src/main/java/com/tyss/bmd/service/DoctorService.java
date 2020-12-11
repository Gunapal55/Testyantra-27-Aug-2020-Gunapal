package com.tyss.bmd.service;

import java.util.Date;
import java.util.List;

import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.DoctorAvailability;
import com.tyss.bmd.entity.DueDays;
import com.tyss.bmd.entity.Rating;
import com.tyss.bmd.entity.User;


public interface DoctorService {

	public Doctor addDoctor(Doctor doctor);

	public Doctor removeDoctor(int doctorId);

	public List<Rating> getAllRating(Rating allRating);

	public List<Appointment> getAllScheduledAppointment(Appointment allAppointments);

	public DoctorAvailability addAvailbility(DoctorAvailability avaible);

	public List<DueDays> updateDueDays(Date dueDaysFrom, Date dueDaysTo);

	public DoctorAvailability updateAvialbility(DoctorAvailability avaibility);

	public Doctor updateDoctor(Doctor doctor);

	public Doctor getDoc(User user);

}
