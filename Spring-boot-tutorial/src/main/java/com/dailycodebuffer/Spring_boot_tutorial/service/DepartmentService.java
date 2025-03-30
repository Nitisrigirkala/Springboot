package com.dailycodebuffer.Spring_boot_tutorial.service;

import com.dailycodebuffer.Spring_boot_tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);
}
