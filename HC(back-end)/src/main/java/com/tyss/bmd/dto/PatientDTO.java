package com.tyss.bmd.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PatientDTO implements Serializable {

	private static final long serialVersionUID = 3712179729068893554L;

	private int patientId;

	private String patientName;

	private int patinetAge;

	private String gender;

	private int patinetPhoneNumber;

	private String patinetEmailId;

	private String patinetPlace;

}
