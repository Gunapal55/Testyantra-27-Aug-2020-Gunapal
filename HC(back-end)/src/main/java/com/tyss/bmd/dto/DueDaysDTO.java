package com.tyss.bmd.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class DueDaysDTO implements Serializable {

	private int doctorId;

	private Date from;

	private Date to;

}
