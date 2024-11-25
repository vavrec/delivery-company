package cz.vavrecka.transportpark.repository;

import cz.vavrecka.transportpark.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, UUID>, CrudRepository<Vehicle, UUID> {
}
