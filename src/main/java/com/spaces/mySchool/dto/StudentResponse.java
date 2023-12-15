package com.spaces.mySchool.dto;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private Long id;
    private String name;
    private String surName;
    private Long groupId;
    private Long schoolId;
}
