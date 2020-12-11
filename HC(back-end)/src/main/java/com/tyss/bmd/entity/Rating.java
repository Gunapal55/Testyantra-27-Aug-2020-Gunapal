package com.tyss.bmd.entity;

import javax.persistence.CascadeType;
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
@Table(name = "ratings")
@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rat_id")
	private int ratingId;


	@Column(name = "doc_id")
	private int doctorId;


	@Column(name = "doc_name")
	private String doctorName;

	@Column(name = "feedback")
	private String feedback;

	@Column(name = "rating")
	private int rating;

	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="pat_id")
	private Patient patientId;

}
