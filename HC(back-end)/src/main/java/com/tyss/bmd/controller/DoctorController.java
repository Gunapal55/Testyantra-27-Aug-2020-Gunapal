package com.tyss.bmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.bmd.dto.ResponseDTO;
import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.DoctorAvailability;
import com.tyss.bmd.entity.Rating;
import com.tyss.bmd.entity.User;
import com.tyss.bmd.service.DoctorService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	private DoctorService service;

	@PostMapping("/register")
	public ResponseDTO getDoctorRegister(@RequestBody Doctor doctor) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addDoctor(doctor));
		return response;
	}

	@PutMapping("/manage-profile")
	public ResponseDTO updateDoctor(@RequestBody Doctor doctor) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updateDoctor(doctor));
		return response;
	}

	@DeleteMapping("/profile/{doctorId}")
	public ResponseDTO delteDoctor(@PathVariable int doctorId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.removeDoctor(doctorId));
		return response;

	}
	
	@PostMapping("/user-data")
	public ResponseDTO getUser(@RequestBody User user) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getDoc(user));
		return response;
	}
	

	@GetMapping("/availability")
	public ResponseDTO addAvailability(@RequestBody DoctorAvailability avaible) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addAvailbility(avaible));
		return response;

	}

	@GetMapping("/ratings")
	public ResponseDTO getAllRatings(Rating allRating) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getAllRating(allRating));
		return response;

	}	

	@GetMapping("/appointments")
	public ResponseDTO getAllScheduledAppointment(Appointment allAppointments) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getAllScheduledAppointment(allAppointments));
		return response;

	}

	@PutMapping("/manage-availability")
	public ResponseDTO updateAvailability(DoctorAvailability avaibility) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updateAvialbility(avaibility));
		return response;
	}
}
