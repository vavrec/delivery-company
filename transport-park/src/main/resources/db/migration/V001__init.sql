CREATE TABLE depo
(
    depo_id UUID PRIMARY KEY,
    name    VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE vehicle
(
    vehicle_id UUID PRIMARY KEY,
    name       VARCHAR(50) NOT NULL UNIQUE,
    depo_id    UUID NOT NULL,
    FOREIGN KEY (depo_id) REFERENCES depo (depo_id)
);