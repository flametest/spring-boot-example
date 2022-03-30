package com.example.demo.controller.dto;

import com.example.demo.entity.User;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class UserDTO {
    public UserDTO(User u) {
        this.id = u.getId();
        this.username = u.getUsername();
        this.profile = new ProfileDTO(u.getProfile());
        this.groups = new HashSet<>();
        u.getGroups().forEach(group -> this.groups.add(new GroupDTO(group)));
    }
    Long id;
    String username;
    ProfileDTO profile;
    Set<GroupDTO> groups;
}
