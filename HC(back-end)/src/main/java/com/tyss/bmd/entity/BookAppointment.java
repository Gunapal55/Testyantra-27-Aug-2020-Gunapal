package com.tyss.bmd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;


import lombok.Data;

@Data
@Repository
@Entity
@Table(name = "Book_appointment")
public class BookAppointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ba_id")
	private int bookAppointmentId;

	@Column(name ="doc_id")
	private int doctorId;

	@Column(name = "avial_id")
	private int avialablityId;
	
	

}
