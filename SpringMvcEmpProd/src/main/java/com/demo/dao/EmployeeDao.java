package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	List<Employee> showAllEmp();

	void addNewEmp(Employee e);

	Employee getById(int id);

	void updateEmp(Employee e);

	void deleteEmp(int id);



}
