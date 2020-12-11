package com.tyss.bmd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data 
@Entity
@Table(name = "Timeslots")
public class TimeSlote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "timeslotId")
	private int timeslotId;

//	@NotNull
	@Column(name = "doctorId")
	private int doctorId;

	@DateTimeFormat
	@Column(name = "timeslotFrom")
	private String timeslotFrom;

	@DateTimeFormat
	@Column(name = "timeslotTo")
	private String timeslotTo;
	

	
	
}
