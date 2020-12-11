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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.bmd.dto.ResponseDTO;
import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.Patient;
import com.tyss.bmd.entity.User;
import com.tyss.bmd.service.AdminService;

@RequestMapping("admin")
@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping("/register-doctor/")
	public ResponseDTO getDoctor(@RequestBody Doctor doctor) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.addDoctor(doctor));
		return response;
	}

	@DeleteMapping("/doctor/{id}")
	public ResponseDTO removeDoctor(@PathVariable int id) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.removeDoctor(id));
		return response;
	}

	@DeleteMapping("/patient/{id}")
	public ResponseDTO removePatient(@PathVariable int id) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.removePatient(id));
		return response;
	}
	
	@GetMapping("/user")
	public ResponseDTO getUser(String email) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.getUser(email));
		return response;
	}
	
	@GetMapping("/appointments")
	public ResponseDTO viewAllAppointments(Appointment appointment) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.viewAllAppointments(appointment));
		return response;
	}

	
	
	@PutMapping("/manage-docotor/profile")
	public ResponseDTO updateDoctor(@RequestBody Doctor doctor) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.updateDoctor(doctor));
		return response;
	}
	
	

	@PutMapping("/manage-patient")
	public ResponseDTO updatePatient(@RequestBody Patient patient) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.updatePatient(patient));
		return response;
	}

	@GetMapping("/doctors")
	public ResponseDTO getAllDoctor() {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.getAllDoctor());
		return response;
	}
 
	@GetMapping("/patients")
	public ResponseDTO getAllPatient() {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.getAllPatient());
		return response;
	}
	
	@PutMapping("/user-data")
	public ResponseDTO updateUser(@RequestBody User user) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.updateUser(user));
		return response;
		
	}

	@DeleteMapping("/appointment/{appointmentId}")
	public ResponseDTO removeAppointment(@RequestParam int appointmentId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(adminService.removeAppointment(appointmentId));
		return response;
	}

}
