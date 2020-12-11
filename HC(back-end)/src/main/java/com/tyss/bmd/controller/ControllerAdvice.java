package com.tyss.bmd.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.bmd.dto.ResponseDTO;

@CrossOrigin(origins = "*")
@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler
	public ResponseDTO handler(Exception e) {
		ResponseDTO dto = new ResponseDTO();
		dto.setError(true);
		dto.setData(e.getMessage());
		return dto;
	}

}
