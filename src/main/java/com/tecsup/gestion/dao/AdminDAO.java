package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Admin;


public interface AdminDAO {
	
	Admin findAdmin(int id) throws DAOException, EmptyResultException;
	
	List<Admin> findAllAdmins() throws DAOException, EmptyResultException;
	
	Admin validate1(String user, String clave) throws LoginException, DAOException;
}
