package com.app.updated.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.updated.querydto.VehicleQueryDTO;
import com.app.updated.service.VehicleQueryService;

@RestController
@RequestMapping(value = "/api/vehicles")
public class VehicleQueryController {
	@Autowired
	private VehicleQueryService vehicleQueryService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<VehicleQueryDTO>> listAllVehicles() {
		return new ResponseEntity<>(vehicleQueryService.listAllVehicles(), HttpStatus.OK);
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<VehicleQueryDTO> getVehicle(@PathVariable(value = "id") UUID id) {
		return new ResponseEntity<>(vehicleQueryService.getVehicle(id), HttpStatus.OK);
	}
}
