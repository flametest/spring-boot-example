package com.example.demo.controller.dto;

import com.example.demo.entity.UserProfile;
import lombok.Data;

@Data
public class ProfileDTO {

    public ProfileDTO(UserProfile profile) {
        this.age = profile.getAge();
    }

    Integer age;
}
