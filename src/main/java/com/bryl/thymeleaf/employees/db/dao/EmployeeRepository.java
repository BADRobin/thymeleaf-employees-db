package com.bryl.thymeleaf.employees.db.dao;

import com.bryl.thymeleaf.employees.db.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByOrderByLastNameAsc();
}
