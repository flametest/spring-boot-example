package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "`group`")
public class Group implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "groups")
    @ToString.Exclude
    private Set<User> users;
}
