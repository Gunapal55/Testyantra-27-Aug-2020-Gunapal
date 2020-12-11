package com.tyss.bmd.dao;

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
import com.tyss.bmd.entity.Patient;
import com.tyss.bmd.entity.Rating;
import com.tyss.bmd.entity.User;

@Repository
public class PatientDAOImpl implements PatientDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public Patient addPatient(Patient newPatient) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		manager.persist(newPatient);
		transcation.commit();
		manager.close();
		return newPatient;

	}

	@Override
	public Patient updatePatient(Patient updatePatient) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Patient updatedPatient1 = manager.find(Patient.class, updatePatient.getPatientId());
		BeanUtils.copyProperties(updatePatient, updatedPatient1);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return updatedPatient1;
	}

	@Override
	public Patient removePatient(String emailId) {
		EntityManager manager = factory.createEntityManager();
		Patient patient = manager.find(Patient.class, emailId);
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		manager.remove(patient);
		manager.getTransaction().commit();
		manager.close();
		return patient;

	}

	@Override
	public Appointment bookAppointment(Appointment bookAppointment) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Appointment bookNewAppointment = new Appointment();
		BeanUtils.copyProperties(bookAppointment, bookNewAppointment);
		manager.persist(bookNewAppointment);
		return bookNewAppointment;
	}

	@Override
	public Appointment updateAppoitment(Appointment updateAppointment) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Appointment updatedAppointment = manager.find(Appointment.class, updateAppointment.getAppointmentId());
		BeanUtils.copyProperties(updateAppointment, updatedAppointment);
		return updatedAppointment;

	}

	@Override
	public List<Doctor> viewAllDoctor(Doctor viewAllDoctor) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Doctor> query = manager.createQuery("FROM Doctor", Doctor.class);
		return query.getResultList();
	}

	@Override
	public Rating giveRatings(Rating rating) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transcation = manager.getTransaction();
		Rating newRating = new Rating();
		BeanUtils.copyProperties(rating, newRating);
		transcation.begin();
		manager.persist(newRating);
		manager.getTransaction().commit();
		manager.close();
		return newRating;
	}

}
