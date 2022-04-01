package com.example.demo.controller.dto;

import com.example.demo.entity.UserProfile;
import lombok.Getter;

@Getter
public class ProfileDTO extends DTO{

    public ProfileDTO(UserProfile profile) {
        this.age = profile.getAge();
    }

    Integer age;
}
