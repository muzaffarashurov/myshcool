package com.spaces.mySchool.model;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SchoolModel {
    private Long id;
    private String name;
    private String address;
    private Set<Long> groupsIds;
}
