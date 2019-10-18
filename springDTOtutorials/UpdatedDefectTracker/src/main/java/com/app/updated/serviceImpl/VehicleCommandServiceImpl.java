package com.app.updated.serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.updated.querydto.VehicleQueryDTO;
import com.app.updated.repository.VehicleRepository;
import com.app.updated.service.VehicleCommandService;
import com.app.updated.vehicle.Vehicle;
import com.app.updated.vehicledto.VehicleCreateDTO;
import com.app.updated.vehicledto.VehicleUpdateDTO;

@Service
public class VehicleCommandServiceImpl implements VehicleCommandService {

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public UUID creatVehicle(VehicleCreateDTO vechicledto) {
		Vehicle vehicle = new Vehicle();
		vehicle.setId(UUID.randomUUID());
		vehicle.setMake(vechicledto.getMake());
		vehicle.setModel(vechicledto.getModel());
//		vehicle.setStatus(String.valueOf(Status.));

		return vehicleRepository.save(vehicle).getId();
	}

	public VehicleQueryDTO updateVehicle(UUID id, VehicleUpdateDTO vehicleUpdateDTO) {

		if (vehicleRepository.findById(id).isPresent()) {
			Vehicle existingVehicle = vehicleRepository.findById(id).get();

			existingVehicle.setMake(vehicleUpdateDTO.getMake());
			existingVehicle.setModel(vehicleUpdateDTO.getModel());

			Vehicle updatedVehicle = vehicleRepository.save(existingVehicle);

			return new VehicleQueryDTO(updatedVehicle.getId(), updatedVehicle.getVehicleIdentityNumber(),
					updatedVehicle.getMake(), updatedVehicle.getModel());
		} else {
			return null;
		}
	}
}
