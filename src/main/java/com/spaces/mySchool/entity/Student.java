package com.spaces.mySchool.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "sur_name", nullable = false)
    private String surName;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Long groupId;
    @Column(name = "school_id")
    private Long schoolId;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

}
