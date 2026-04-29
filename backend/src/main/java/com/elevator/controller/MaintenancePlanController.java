package com.elevator.controller;

import com.elevator.entity.MaintenancePlan;
import com.elevator.service.MaintenancePlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maintenance-plans")
@RequiredArgsConstructor
public class MaintenancePlanController {
    private final MaintenancePlanService maintenancePlanService;

    @GetMapping
    public List<MaintenancePlan> list() {
        return maintenancePlanService.list();
    }

    @PostMapping
    public boolean create(@RequestBody MaintenancePlan maintenancePlan) {
        maintenancePlan.setStatus(maintenancePlan.getStatus() == null ? "PENDING" : maintenancePlan.getStatus());
        return maintenancePlanService.save(maintenancePlan);
    }
}
