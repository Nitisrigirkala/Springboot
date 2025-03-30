package com.dailycodebuffer.Spring_boot_tutorial.service;

import com.dailycodebuffer.Spring_boot_tutorial.entity.Department;
import com.dailycodebuffer.Spring_boot_tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}


