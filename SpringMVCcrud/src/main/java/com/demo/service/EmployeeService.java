package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	List<Employee> showAllEmp();

	void addNewEmp(Employee e);

	Employee getbyId(int id);

	void updateEmp(Employee e);

	void deleteEmp(int id);

}
