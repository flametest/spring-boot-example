package com.example.demo.controller.dto;

import com.example.demo.entity.Group;
import lombok.Getter;

@Getter
public class GroupDTO extends DTO{
    public GroupDTO(Group group) {
        this.id = group.getId();
        this.name = group.getName();
    }

    private final Long id;
    private final String name;
}
