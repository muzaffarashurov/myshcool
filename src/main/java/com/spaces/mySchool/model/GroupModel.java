package com.spaces.mySchool.model;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupModel {
    private Long id;
    private String name;
    private Long schoolId;
    private Set<Long> studentsIds;
}
