package com.springboot_jdbc.dao;

import com.springboot_jdbc.model.EmployeeModel;

import java.util.List;

public interface EmployeeDAO {
    int save(EmployeeModel employee);

    int update(EmployeeModel employee, int id);

    int delete(int id);

    List<EmployeeModel> getAll();

    EmployeeModel getById(int id);
}
