package com.tyss.bmd.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data

public class TimeSlotsDTO implements Serializable {

	private int timeslotId;

	private int doctorId;

	private String timeslotFrom;

	private String timeslotTo;

}
