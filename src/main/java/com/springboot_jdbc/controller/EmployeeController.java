package com.springboot_jdbc.controller;

import com.springboot_jdbc.dao.EmployeeDAO;
import com.springboot_jdbc.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/employees")
    public List<EmployeeModel> getEmployees(){
        return employeeDAO.getAll();
    }

    @GetMapping("/employees/{id}")
    public EmployeeModel getEmployeeById(@PathVariable int id) {
        return employeeDAO.getById(id);
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody EmployeeModel employee) {
       return "Count of rows saved to db = " + employeeDAO.save(employee);
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@RequestBody EmployeeModel employee, @PathVariable int id){
        return "Number of rows updated = " + employeeDAO.update(employee, id);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return "Number of rows deleted = " + employeeDAO.delete(id);
    }
}
