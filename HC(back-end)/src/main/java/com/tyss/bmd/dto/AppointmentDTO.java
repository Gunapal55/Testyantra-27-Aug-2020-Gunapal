package com.tyss.bmd.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data

public class AppointmentDTO implements Serializable {

	private int appointmentId;

	private String doctorName;

	private String symptoms;

	private String appointmentStatus;

	private int doctorId;

}
