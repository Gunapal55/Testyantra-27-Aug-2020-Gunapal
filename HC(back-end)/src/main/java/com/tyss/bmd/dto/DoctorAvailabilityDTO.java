package com.tyss.bmd.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class DoctorAvailabilityDTO implements Serializable {

	private int availbilityId;

	private String availableDays;

	private String bookAppointment;

	private int doctorId;

	private int bookAppointmentId;

}
