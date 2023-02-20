package de.memozone.spring.crud.test.repository;

import de.memozone.spring.crud.test.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    
    public Department findByDepartmentName(String departmentName);
    
    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
