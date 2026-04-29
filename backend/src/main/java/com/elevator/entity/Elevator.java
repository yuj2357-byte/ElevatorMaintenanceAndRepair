package com.elevator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@TableName("elevator")
public class Elevator {
    @TableId(type = IdType.AUTO)
    private Long id;

    @NotBlank(message = "设备编号不能为空")
    private String code;

    @NotBlank(message = "品牌型号不能为空")
    private String model;

    private String location;

    private String status;
}
