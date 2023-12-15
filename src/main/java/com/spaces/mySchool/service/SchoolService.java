package com.spaces.mySchool.service;

import com.spaces.mySchool.entity.School;
import com.spaces.mySchool.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public List<School> getAll() {
        return schoolRepository.findAll();
    }
}
