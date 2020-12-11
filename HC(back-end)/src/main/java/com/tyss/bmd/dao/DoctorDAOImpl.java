 package com.tyss.bmd.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.DoctorAvailability;
import com.tyss.bmd.entity.DueDays;
import com.tyss.bmd.entity.Rating;
import com.tyss.bmd.entity.User;

@Repository
public class DoctorDAOImpl implements DoctorDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
		public Doctor addDoctor(Doctor doctor) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		manager.persist(doctor);
		manager.getTransaction().commit();
		manager.close();
		return doctor;

	}

	@Override
	public Doctor removeDoctor(int doctorId) {
		EntityManager manager = factory.createEntityManager();
		Doctor doctor = manager.find(Doctor.class, doctorId);
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		manager.remove(doctor);
		manager.getTransaction().commit();
		manager.close();
		return doctor;
	}

	@Override
	public List<Appointment> getAllScheduledAppointment(Appointment allAppointments) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Appointment> query = manager.createQuery("FROM Appointment", Appointment.class);
		return query.getResultList();
	}

	@Override
	public DoctorAvailability updateAvialbility(DoctorAvailability avaibility) {
		EntityManager manager = factory.createEntityManager();
		DoctorAvailability doctorAvailable = manager.find(DoctorAvailability.class, avaibility.getAvailbilityId());
		if (doctorAvailable != null) {
			BeanUtils.copyProperties(avaibility, doctorAvailable);
			manager.getTransaction().begin();
			manager.close();
			return doctorAvailable;
		} else {
			manager.close();
			return null;
		}
	}

	@Override
	public DoctorAvailability addAvailbility(DoctorAvailability avaible) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		manager.persist(avaible);
		manager.getTransaction().commit();
		manager.close();
		return avaible;
	}

	@Override
	public List<Rating> getAllRating(Rating allRating) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Rating> query = manager.createQuery("FROM Appointment", Rating.class);
		List<Rating> allRatings = query.getResultList();
		return allRatings;
	}

	

	@Override
	public Doctor updateDoctor(Doctor doctor) {

		EntityManager manager = factory.createEntityManager();
		Doctor doctor1 = manager.find(Doctor.class, doctor.getDoctorId());

		if (doctor1 != null) {
			manager.getTransaction().begin();
			BeanUtils.copyProperties(doctor, doctor1);
			manager.getTransaction().commit();
			manager.close();
			return doctor1;
		} else {
			manager.close();
			return null;
		}
	}

	@Override
	public List<DueDays> updateDueDays(Date dueDaysFrom, Date dueDaysTo) {

		EntityManager manager = factory.createEntityManager();
		TypedQuery<DueDays> query = manager.createQuery(
				"UPDATE DueDays set dueDaysFrom= :from, dueDaysTo= :to where id= :dueDaysId", DueDays.class);
		return query.getResultList();
	}
	
	@Override
	public Doctor getDoc(User user) {
		
		EntityManager manager = factory.createEntityManager();		
		TypedQuery<Doctor> query = manager.createQuery("FROM Doctor D WHERE D.user=:val", Doctor.class);
		query.setParameter("val", user);
		return query.getSingleResult();

	}

}
