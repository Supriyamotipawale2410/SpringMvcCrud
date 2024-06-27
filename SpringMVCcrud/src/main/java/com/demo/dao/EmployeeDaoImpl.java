package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> showAllEmp() {
		
		List<Employee> elist=jdbcTemplate.query("select * from employee" ,(rs,num)->
												{
													Employee e = new Employee();
													e.setId(rs.getInt(1));
													e.setName(rs.getString(2));
													e.setRole(rs.getString(3));
													e.setSalary(rs.getInt(4));
													return e;
												});
												return elist;
	}

	@Override
	public void addNewEmp(Employee e) {
		jdbcTemplate.update("insert into employee values(?,?,?,?)", new Object[] {
																	e.getId(),e.getName(),e.getRole(),e.getSalary()
							});
		
	}

	@Override
	public Employee getById(int id) {
		Employee e = jdbcTemplate.queryForObject("select * from employee where id=?", new Object[] {id},BeanPropertyRowMapper.newInstance(Employee.class));
		return e;
	}

	@Override
	public void updateEmp(Employee e) {
		jdbcTemplate.update("update employee set name=?, role=?,salary=? where id=?" ,
							new Object[] {e.getName(),e.getRole(),e.getSalary(),e.getId()
				});
		
	}

	@Override
	public void deleteEmp(int id) {
		jdbcTemplate.update("delete from employee where id=?" , new Object[] {id});
		
	}
}
