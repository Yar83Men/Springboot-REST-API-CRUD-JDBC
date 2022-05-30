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