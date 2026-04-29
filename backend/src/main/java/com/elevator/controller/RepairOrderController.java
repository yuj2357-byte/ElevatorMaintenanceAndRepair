package com.elevator.controller;

import com.elevator.entity.RepairOrder;
import com.elevator.service.RepairOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/repair-orders")
@RequiredArgsConstructor
public class RepairOrderController {
    private final RepairOrderService repairOrderService;

    @GetMapping
    public List<RepairOrder> list() {
        return repairOrderService.list();
    }

    @PostMapping
    public boolean create(@RequestBody RepairOrder repairOrder) {
        repairOrder.setStatus(repairOrder.getStatus() == null ? "OPEN" : repairOrder.getStatus());
        return repairOrderService.save(repairOrder);
    }
}
