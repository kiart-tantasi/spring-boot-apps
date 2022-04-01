package com.learning.demo.springbootcrudjpaapi.dao;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getEmployees();

    public Employee getEmployeeById(int id);

    public void saveOrUpdateEmployee(Employee employee);

    public void deleteEmployeeById(int id);
}
