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
@Entity
@Table(name = "Appointment_info")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "apt_id")
	private int appointmentId;

//	@Pattern(regexp = "(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{6,15})$")
	@Column(name = "doc_nm")
	private String doctorName;

	@Column(name = "symp")
	private String symptoms;

	@Column(name = "apt_sts")
	private String appointmentStatus;

	@Column(name = "doc_id")
	private int doctorId;
	
	@ManyToMany(cascade= CascadeType.ALL)
	private List<Patient> Patient;

}
