package de.memozone.spring.crud.test.repository;

import de.memozone.spring.crud.test.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {

        Department department = Department.builder()
                .departmentName("Mechanical Engineering")
                .departmentCode("ME-011")
                .departmentAddress("Frankfurt")
                .build();

        entityManager.persist(department);
    }

    @Test
    public void whenFindById_thenReturnDepartment(){

        Department department = departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentName(),"Mechanical Engineering");

    }


}