package com.spaces.mySchool.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "group_entity")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "school_id", nullable = false)
    private Long schoolId;

    @OneToMany(mappedBy = "group", orphanRemoval = true)
    private Set<Student> students = new HashSet<>();


    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

}
