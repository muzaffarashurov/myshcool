package com.spaces.mySchool.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentModel {
    private Long id;
    private String name;
    private String surName;
    private Long groupId;
    private Long schoolId;
}
