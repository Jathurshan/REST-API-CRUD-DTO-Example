package com.app.updated.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.updated.vehicle.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, UUID> {
	List<Vehicle> findByMake(@Param("make") String make);
}
