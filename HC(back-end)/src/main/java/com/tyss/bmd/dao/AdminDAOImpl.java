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
import com.tyss.bmd.entity.User;

@Repository
public class AdminDAOImpl implements AdminDAO {
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
	public Doctor removeDoctor(int id) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Doctor doctor = manager.find(Doctor.class, id);
		manager.remove(doctor);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return doctor;

	}

	@Override
	public Patient removePatient(int patientId) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Patient deletePatient = manager.find(Patient.class, patientId);
		manager.remove(deletePatient);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return deletePatient;

	}

	@Override
	public List<Appointment> viewAllAppointments(Appointment appointment) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Appointment> query = manager.createQuery("FROM Appointment", Appointment.class);
		return query.getResultList();
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Doctor updateDoctor = manager.find(Doctor.class, doctor.getDoctorId());
		BeanUtils.copyProperties(doctor, updateDoctor);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return updateDoctor;

	}

	@Override
	public Patient updatePatient(Patient updatePatient) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Patient updatedPatient = manager.find(Patient.class, updatePatient.getPatientId());
		BeanUtils.copyProperties(updatePatient, updatePatient);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return updatedPatient;

	}

	@Override
	public List<Doctor> getAllDoctor() {

		EntityManager manager = factory.createEntityManager();
		TypedQuery<Doctor> query = manager.createQuery("FROM Doctor", Doctor.class);
		return query.getResultList();
	}

	@Override
	public List<Patient> getAllPatient() {

		EntityManager manager = factory.createEntityManager();
		TypedQuery<Patient> query = manager.createQuery("FROM Patient", Patient.class);
		return query.getResultList();
	}

	@Override
	public Appointment removeAppointment(int appointmentId) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Appointment deleteAppointment = manager.find(Appointment.class, appointmentId);
		manager.remove(deleteAppointment);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return deleteAppointment;
	}

	@Override
	public User getUser(String email) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		TypedQuery<User> data = manager.createQuery("FROM User U where U.email=:val", User.class);
		data.setParameter("val", email);
		return data.getSingleResult();
	}

	@Override
	public User updateUser(User user) {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			User data = manager.find(User.class, user.getUserId());
			 BeanUtils.copyProperties(user, data);
			 manager.getTransaction().commit();
			 manager.close();
			 factory.close();
			 return data;
	}

}