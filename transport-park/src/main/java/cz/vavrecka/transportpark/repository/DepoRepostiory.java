package cz.vavrecka.transportpark.repository;

import cz.vavrecka.transportpark.domain.Depo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DepoRepostiory extends PagingAndSortingRepository<Depo, UUID>, CrudRepository<Depo, UUID> {
}
