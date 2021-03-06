package com.app.updated.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.updated.querydto.VehicleQueryDTO;
import com.app.updated.repository.VehicleRepository;
import com.app.updated.service.VehicleQueryService;
import com.app.updated.vehicle.Vehicle;

@Service
public class VehicleQueryServiceImplementation implements VehicleQueryService {
	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public VehicleQueryDTO getVehicle(UUID id) {
		if (vehicleRepository.findById(id).isPresent()) {
			Vehicle fetchedVehicle = vehicleRepository.findById(id).get();
			return new VehicleQueryDTO(fetchedVehicle.getId(), fetchedVehicle.getVehicleIdentityNumber(),
					fetchedVehicle.getMake(), fetchedVehicle.getModel());
		} else {
			return null;
		}
	}
	
	@Override
    public List<VehicleQueryDTO> listAllVehicles() {
        List<VehicleQueryDTO> vehicleList = new ArrayList<>();
        
        vehicleRepository.findAll().forEach(vehicle -> {
            vehicleList.add(new VehicleQueryDTO(vehicle.getId(), vehicle.getVehicleIdentityNumber(), vehicle.getMake(), vehicle.getModel()));
        });
        
        return vehicleList;
    }
}
