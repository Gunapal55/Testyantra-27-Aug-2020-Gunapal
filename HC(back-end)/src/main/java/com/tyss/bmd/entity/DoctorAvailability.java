package com.tyss.bmd.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "Doctor_availbility")
@Entity
public class DoctorAvailability {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "avail_id")
	private int availbilityId;

	@Column(name = "avail_days")
	private String availableDays;

	@Column(name = "book_apt")
	private String bookAppointment;

	@Column(name = "doc_id")
	private int doctorId;

	@Column(name = "ba_id")
	private int bookAppointmentId;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Doctor> doctors;

}
