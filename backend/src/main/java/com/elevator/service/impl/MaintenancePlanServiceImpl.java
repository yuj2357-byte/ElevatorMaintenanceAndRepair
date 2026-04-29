package com.elevator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elevator.entity.MaintenancePlan;
import com.elevator.mapper.MaintenancePlanMapper;
import com.elevator.service.MaintenancePlanService;
import org.springframework.stereotype.Service;

@Service
public class MaintenancePlanServiceImpl extends ServiceImpl<MaintenancePlanMapper, MaintenancePlan> implements MaintenancePlanService {
}
