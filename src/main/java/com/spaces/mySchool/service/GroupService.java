package com.spaces.mySchool.service;

import com.spaces.mySchool.entity.Group;
import com.spaces.mySchool.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {
    private GroupRepository groupRepository;

    public List<Group> getAll() {
        return groupRepository.findAll();
    }
}
