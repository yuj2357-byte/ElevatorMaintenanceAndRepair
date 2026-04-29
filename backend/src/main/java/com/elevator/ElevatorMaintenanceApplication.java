package com.elevator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.elevator.mapper")
public class ElevatorMaintenanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElevatorMaintenanceApplication.class, args);
    }
}
