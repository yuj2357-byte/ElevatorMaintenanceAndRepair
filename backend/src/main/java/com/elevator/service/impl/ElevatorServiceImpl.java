package com.elevator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elevator.entity.Elevator;
import com.elevator.mapper.ElevatorMapper;
import com.elevator.service.ElevatorService;
import org.springframework.stereotype.Service;

@Service
public class ElevatorServiceImpl extends ServiceImpl<ElevatorMapper, Elevator> implements ElevatorService {
}
