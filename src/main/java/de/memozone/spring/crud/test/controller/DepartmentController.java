package de.memozone.spring.crud.test.controller;

import de.memozone.spring.crud.test.entity.Department;
import de.memozone.spring.crud.test.service.DepartmentService;
import de.memozone.spring.crud.test.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {

        return departmentService.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) {

        return departmentService.getDepartmentById(departmentId);

    }

    @DeleteMapping("/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {

        departmentService.deleteDepartmentById(departmentId);
        return "Department delete Successfully";
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {

        return departmentService.updateDepartment(departmentId, department);

    }

    @GetMapping("/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName ){

        return departmentService.getDepartmentByName(departmentName);
    }



}
