package cz.vavrecka.transportpark;

import org.springframework.boot.SpringApplication;

public class TestTransportParkApplication {

    public static void main(String[] args) {
        SpringApplication.from(TransportParkApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
