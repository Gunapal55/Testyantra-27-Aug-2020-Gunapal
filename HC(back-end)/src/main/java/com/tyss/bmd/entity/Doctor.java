package com.tyss.bmd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Doctor_info")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doc_id")
	private int doctorId;

	@Column(name = "doc_nm")
	private String doctorName;

	@Column(name = "doc_qual")
	private String doctorQualification;

	@Column(name = "doc_splz")
	private String doctorSpeacilization;

	@Column(name = "pra_fm")
	private String praticefrom;
 
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "doc_id", referencedColumnName = "doc_id")
//	List<Appointment> appointments = new ArrayList<Appointment>();

	@OneToOne
	@JoinColumn(name = "usr_id")
	private User user;
	
}
