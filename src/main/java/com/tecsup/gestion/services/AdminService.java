package com.tecsup.gestion.services;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Admin;



public interface AdminService {
	Admin find(int id) throws DAOException, EmptyResultException;
	
	List<Admin> findAll() throws DAOException, EmptyResultException;
}
