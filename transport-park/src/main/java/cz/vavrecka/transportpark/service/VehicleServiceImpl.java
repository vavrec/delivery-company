package cz.vavrecka.transportpark.service;

import cz.vavrecka.transportpark.domain.Vehicle;
import cz.vavrecka.transportpark.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VehicleServiceImpl {

    private final VehicleRepository vehicleRepository;

    public void createVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

}
