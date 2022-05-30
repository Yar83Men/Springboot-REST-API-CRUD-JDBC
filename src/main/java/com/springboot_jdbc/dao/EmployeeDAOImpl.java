package com.springboot_jdbc.dao;

import com.springboot_jdbc.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(EmployeeModel employee) {
        return jdbcTemplate.update("INSERT INTO tbl_employees (name, email, department) VALUES (?, ?, ?)",
                employee.getName(), employee.getEmail(), employee.getDepartment());
    }

    @Override
    public int update(EmployeeModel employee, int id) {
        return jdbcTemplate.update("UPDATE tbl_employees SET name=?, email=?, department=? WHERE id=?",
                employee.getName(), employee.getEmail(), employee.getDepartment(), id);
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM tbl_employees WHERE id=?", id);
    }

    @Override
    public List<EmployeeModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM tbl_employees",
                new BeanPropertyRowMapper<EmployeeModel>(EmployeeModel.class));

    }

    @Override
    public EmployeeModel getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM tbl_employees WHERE id=?",
                new BeanPropertyRowMapper<EmployeeModel>(EmployeeModel.class),
                id);
    }
}
