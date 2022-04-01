package com.example.demo.controller.dto;

import com.example.demo.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class UserDTO extends DTO{
    public UserDTO(User u) {
        this.id = u.getId();
        this.username = u.getUsername();
        this.profile = new ProfileDTO(u.getProfile());
        this.groups = new HashSet<>();
        this.createdAt = LocalDateTimeToUnixMillis(u.getCreatedAt());
        u.getGroups().forEach(group -> this.groups.add(new GroupDTO(group)));
    }
    Long id;
    String username;
    ProfileDTO profile;
    Set<GroupDTO> groups;
    @JsonProperty("created_at")
    Long createdAt;
}
