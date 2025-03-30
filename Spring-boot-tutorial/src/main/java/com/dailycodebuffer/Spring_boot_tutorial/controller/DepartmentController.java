package com.dailycodebuffer.Spring_boot_tutorial.controller;

import com.dailycodebuffer.Spring_boot_tutorial.entity.Department;
import com.dailycodebuffer.Spring_boot_tutorial.service.DepartmentService;
import com.dailycodebuffer.Spring_boot_tutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
       return departmentService.saveDepartment(department);

    }
}
