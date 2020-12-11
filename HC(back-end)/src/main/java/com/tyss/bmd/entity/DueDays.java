package com.tyss.bmd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "Due_days")
@Data
public class DueDays {

//	@NotNull
	@Column(name = "doc_id")
	private int doctorId;
	
	@Id
	@DateTimeFormat
	@Column(name = "start")
	private Date from;

	@DateTimeFormat
	@Column(name = "end")
	private Date to;

	
}
