package de.memozone.spring.crud.test.service;


import de.memozone.spring.crud.test.entity.Department;
import de.memozone.spring.crud.test.error.DepartmentNotFoundException;

import java.util.List;


public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department getDepartmentByName(String departmentName);
}
