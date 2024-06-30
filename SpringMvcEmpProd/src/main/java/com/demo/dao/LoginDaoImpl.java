package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.User;

@Repository
public class LoginDaoImpl implements LoginDao{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public User authenticateUser(String uname, String pass) {
		try {
		User u=jdbcTemplate.queryForObject("select username,role from user where username=? and password=?", 
									new Object[] {uname,pass},BeanPropertyRowMapper.newInstance(User.class));
		return u;
		}
		catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
}
