package com.bryl.thymeleaf.employees.db.service;

import com.bryl.thymeleaf.employees.db.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();
    public Employee findById(int theId);
    public void save(Employee theEmployee);
    public void deleteById(int theId);


}
