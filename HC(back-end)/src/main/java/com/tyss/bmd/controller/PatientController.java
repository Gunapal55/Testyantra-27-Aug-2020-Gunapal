package com.tyss.bmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.bmd.dto.ResponseDTO;
import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.Patient;
import com.tyss.bmd.entity.Rating;
import com.tyss.bmd.service.PatientService;

@RequestMapping("patient")
@RestController
@CrossOrigin(origins = "*")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@PostMapping("/register")
	public ResponseDTO addPatient(@RequestBody Patient patient) {
		ResponseDTO response = new ResponseDTO();
		response.setData(patientService.addPatient(patient));
		return response;
	}
	
	@PutMapping("/updatePatient")		
	public ResponseDTO updatePatient(@RequestBody Patient patient) {
		ResponseDTO response = new ResponseDTO();
		response.setData(patientService.updatePatient(patient));
		return response;
	}
	
	@PostMapping("/appointment")
	public ResponseDTO bookAppointment(@RequestBody Appointment bookAppointment) {
		ResponseDTO response = new ResponseDTO();
		response.setData(patientService.bookAppointment(bookAppointment));
		return response;
	}

	@PostMapping("/rating")
	public ResponseDTO giveRatings(@RequestBody Rating rating) {
		ResponseDTO response = new ResponseDTO();
		response.setData(patientService.giveRatings(rating));
		return response;
	}

	@GetMapping("/doctors")
	public ResponseDTO viewAllDoctors(Doctor viewAllDoctor) {
		ResponseDTO response = new ResponseDTO();
		response.setData(patientService.viewAllDoctor(viewAllDoctor));
		return response;
	}

}
