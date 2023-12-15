package com.spaces.mySchool.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CreateStudentRequest {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String surName;
    @NonNull
    private Long groupId;
    @NonNull
    private Long schoolId;
}
