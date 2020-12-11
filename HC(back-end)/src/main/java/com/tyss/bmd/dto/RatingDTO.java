package com.tyss.bmd.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class RatingDTO implements Serializable {

	private int ratingId;

	private String patientId;

	private int doctorId;

	private String doctorName;

	private String feedback;

	private int rating;

}
