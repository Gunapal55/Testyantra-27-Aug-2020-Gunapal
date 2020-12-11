package com.tyss.bmd.dao;

import java.util.Date;
import java.util.List;

import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.DoctorAvailability;
import com.tyss.bmd.entity.DueDays;
import com.tyss.bmd.entity.Rating;
import com.tyss.bmd.entity.User;


public interface DoctorDAO {

	public Doctor addDoctor(Doctor doctor);

	public Doctor updateDoctor(Doctor doctor);

	public Doctor removeDoctor(int doctorId);

	public List<Rating> getAllRating(Rating allRating);

	public List<Appointment> getAllScheduledAppointment(Appointment allAppointments);

	public DoctorAvailability addAvailbility(DoctorAvailability avaible);

	public DoctorAvailability updateAvialbility(DoctorAvailability avaibility);

	public List<DueDays> updateDueDays(Date dueDaysFrom, Date dueDaysTo);

	public	Doctor getDoc(User user);

}
