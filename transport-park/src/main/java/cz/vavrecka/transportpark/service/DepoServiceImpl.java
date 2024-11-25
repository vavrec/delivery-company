package cz.vavrecka.transportpark.service;

import cz.vavrecka.transportpark.domain.Depo;
import cz.vavrecka.transportpark.domain.Vehicle;
import cz.vavrecka.transportpark.repository.DepoRepostiory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.UUID;


@Service
@Transactional
@AllArgsConstructor
public class DepoServiceImpl {

    private final DepoRepostiory depoRepostiory;

    public Depo createDepo(Depo depo) {
        return depoRepostiory.save(depo);
    }

    public Depo findById(UUID id) {
        return depoRepostiory.findById(id).orElse(null);
    }


}
