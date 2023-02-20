package de.memozone.spring.crud.test.service;


import de.memozone.spring.crud.test.entity.Department;

import java.util.List;


public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department getDepartmentByName(String departmentName);
}
