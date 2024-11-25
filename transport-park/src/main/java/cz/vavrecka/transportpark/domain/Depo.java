package cz.vavrecka.transportpark.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Depo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "depo_id")
    private UUID id;

    private String name;
}

