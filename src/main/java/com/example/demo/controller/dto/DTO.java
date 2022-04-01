package com.example.demo.controller.dto;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
public abstract class DTO {

    public Long LocalDateTimeToUnixMillis(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
