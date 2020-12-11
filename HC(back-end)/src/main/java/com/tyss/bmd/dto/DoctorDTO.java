package com.tyss.bmd.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class DoctorDTO implements Serializable {

	private int doctorId;

	private String doctorName;

	private String doctorQualification;

	private String doctorSpeacilization;

	private String praticefrom;

}
