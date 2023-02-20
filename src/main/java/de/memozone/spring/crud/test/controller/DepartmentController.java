package de.memozone.spring.crud.test.controller;

import de.memozone.spring.crud.test.entity.Department;
import de.memozone.spring.crud.test.error.DepartmentNotFoundException;
import de.memozone.spring.crud.test.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER= LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {

        LOGGER.info("Inside getAllDepartments of DepartmentController");
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        LOGGER.info("Inside getDepartmentById of DepartmentController");
        return departmentService.getDepartmentById(departmentId);

    }

    @DeleteMapping("/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("Inside deleteDepartmentById of DepartmentController");
        departmentService.deleteDepartmentById(departmentId);
        return "Department delete Successfully";
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        LOGGER.info("Inside updateDepartment of DepartmentController");
        return departmentService.updateDepartment(departmentId, department);

    }

    @GetMapping("/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName ){
        LOGGER.info("Inside getDepartmentByName of DepartmentController");
        return departmentService.getDepartmentByName(departmentName);
    }



}
