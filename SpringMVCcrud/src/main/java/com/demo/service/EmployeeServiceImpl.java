package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
 
	@Autowired
	EmployeeDao edao;

	@Override
	public List<Employee> showAllEmp() {
		// TODO Auto-generated method stub
		return edao.showAllEmp();
	}

	@Override
	public void addNewEmp(Employee e) {
		edao.addNewEmp(e);
		
	}

	@Override
	public Employee getbyId(int id) {
		// TODO Auto-generated method stub
		return edao.getById(id);
	}

	@Override
	public void updateEmp(Employee e) {
		// TODO Auto-generated method stub
		edao.updateEmp(e);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		edao.deleteEmp(id);
	}
}
