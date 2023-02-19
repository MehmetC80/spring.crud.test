package de.memozone.spring.crud.test.service;


import de.memozone.spring.crud.test.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);
}
