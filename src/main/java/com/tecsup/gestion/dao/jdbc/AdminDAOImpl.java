package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.AdminDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.mapper.AdminMapper;
import com.tecsup.gestion.model.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO{
	
private static final Logger logger = LoggerFactory.getLogger(AdminDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Admin findAdmin(int id) throws DAOException, EmptyResultException {
		
		String query = "SELECT *" 
				+ " FROM admin WHERE id = ?";
		
		Object[] params = new Object[] {id};
		
		try {
			Admin adm = (Admin) jdbcTemplate.queryForObject(query, params, new AdminMapper());
			return adm;
			
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	
	}

	@Override
	public List<Admin> findAllAdmins() throws DAOException, EmptyResultException {
		String query = "SELECT * FROM admin";
		
		try {
			List<Admin> admins = jdbcTemplate.query(query, new AdminMapper());
			return admins;
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();	
		}catch (Exception ex) {
			logger.info("Error: " + ex.getMessage());
			throw new DAOException(ex.getMessage());
		}
	}

	@Override
	public Admin validate1(String login, String pwd) throws LoginException, DAOException {
		logger.info("validate1(): login: " + login + ", clave: " + pwd);
		
		if ("".equals(login) && "".equals(pwd)) {
			throw new LoginException("Login and password incorrect");
		}
	
		String query = "SELECT id, name, password  "
				+ " FROM admin WHERE name=? AND password=?";
	
		Object[] params = new Object[] { login, pwd };
	
		try {
	
			Admin adm = jdbcTemplate.queryForObject(query, params, new AdminMapper());
			//
			return adm;
	
		} catch (EmptyResultDataAccessException e) {
			logger.info("Employee y/o clave incorrecto");
			throw new LoginException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	

}
