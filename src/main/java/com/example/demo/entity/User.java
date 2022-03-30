package com.example.demo.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
    private UserProfile profile;

    @ManyToMany
    @ToString.Exclude
    @JoinTable(
            name = "user_group",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="group_id")
    )
    private Set<Group> groups;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
