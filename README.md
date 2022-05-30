# Springboot-REST-API-CRUD-JDBC
Spring boot REST API + JDBC
## SQL
CREATE DATABASE springbootjdbs;
USE springbootjdbs;
CREATE TABLE tbl_employees (
id INT PRIMARY KEY auto_increment,
name VARCHAR(255) NOT NULL,
email varchar(255) NOT null,
department varchar(255) not null
);

insert into tbl_employees(name, email, department)
values ("Tom", "tom@gmail.com", "IT");

insert into tbl_employees(name, email, department)
values ("Jim", "jimi@gmail.com", "HR");

insert into tbl_employees(name, email, department)
values ("Alice", "alice@gmail.com", "IT");

## Endpoints:
GET  /employees  --------------> return list of all employees
GET  /employees/id ------------> return employee by id
POST /employees/ --------------> save employee
PUT  /employees/id ------------> update employee by id
DELETE /employees/id ----------> delete employee by id
