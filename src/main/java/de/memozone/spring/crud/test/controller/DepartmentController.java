package de.memozone.spring.crud.test.controller;

import de.memozone.spring.crud.test.entity.Department;
import de.memozone.spring.crud.test.service.DepartmentService;
import de.memozone.spring.crud.test.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments(){

        return departmentService.getAllDepartments();
    }



}
