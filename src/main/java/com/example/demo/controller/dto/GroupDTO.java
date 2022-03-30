package com.example.demo.controller.dto;

import com.example.demo.entity.Group;
import lombok.Data;

@Data
public class GroupDTO {
    public GroupDTO(Group group) {
        this.id = group.getId();
        this.name = group.getName();
    }

    private Long id;
    private String name;
}
