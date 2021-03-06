package com.app.updated.service;

import java.util.UUID;

import com.app.updated.querydto.VehicleQueryDTO;
import com.app.updated.vehicledto.VehicleCreateDTO;
import com.app.updated.vehicledto.VehicleUpdateDTO;

public interface VehicleCommandService {
	public UUID creatVehicle(VehicleCreateDTO vehicleCreateDTO);
	public VehicleQueryDTO updateVehicle(UUID id, VehicleUpdateDTO vehicleUpdateDTO);
}
