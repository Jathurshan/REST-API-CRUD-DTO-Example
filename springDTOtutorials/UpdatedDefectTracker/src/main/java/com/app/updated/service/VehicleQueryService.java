package com.app.updated.service;

import java.util.List;
import java.util.UUID;

import com.app.updated.querydto.VehicleQueryDTO;

public interface VehicleQueryService {
	public VehicleQueryDTO getVehicle(UUID id);

	public List<VehicleQueryDTO> listAllVehicles();
}
