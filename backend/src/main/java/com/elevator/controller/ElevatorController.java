package com.elevator.controller;

import com.elevator.entity.Elevator;
import com.elevator.service.ElevatorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/elevators")
@RequiredArgsConstructor
public class ElevatorController {
    private final ElevatorService elevatorService;

    @GetMapping
    public List<Elevator> list() {
        return elevatorService.list();
    }

    @PostMapping
    public boolean create(@RequestBody @Valid Elevator elevator) {
        elevator.setStatus(elevator.getStatus() == null ? "IN_SERVICE" : elevator.getStatus());
        return elevatorService.save(elevator);
    }
}
