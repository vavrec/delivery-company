package cz.vavrecka.transportpark;


import cz.vavrecka.transportpark.domain.Depo;
import cz.vavrecka.transportpark.domain.Vehicle;
import cz.vavrecka.transportpark.repository.DepoRepostiory;
import cz.vavrecka.transportpark.repository.VehicleRepository;
import cz.vavrecka.transportpark.service.DepoServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;
import java.util.UUID;

@Configuration
public class CLR {


    @Bean
    public CommandLineRunner run(DepoRepostiory depoRepostiory, VehicleRepository vehicleRepository, DepoServiceImpl depoService) {
        return agrs -> {



//            Depo depo = Depo.builder().name("test" + UUID.randomUUID()).build();
//
//            depoRepostiory.save(depo);
//
//
//            Vehicle vehicle = Vehicle.builder().name("aaaa" + UUID.randomUUID()).depo(depo).build();
//
//            vehicleRepository.save(vehicle);


        };
    }


}
