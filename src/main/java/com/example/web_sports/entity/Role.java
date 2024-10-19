package com.example.web_sports.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Role {

    @Id
    @Column(nullable = false, unique = true)
    String name;

    String description;

//    @ManyToMany
//    @JoinTable(
//            name = "role_permission", // Tên của bảng nối
//            joinColumns = @JoinColumn(name = "role_name"), // Liên kết tới cột trong bảng Role
//            inverseJoinColumns = @JoinColumn(name = "permission_name") // Liên kết tới cột trong bảng Permission
//    )
   // Set<Permission> permissions;
}