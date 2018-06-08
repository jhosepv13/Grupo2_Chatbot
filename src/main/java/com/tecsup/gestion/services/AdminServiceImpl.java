package com.tecsup.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.AdminDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public Admin find(int id) throws DAOException, EmptyResultException {
		Admin adm = adminDAO.findAdmin(id);
		return adm;
	}

	@Override
	public List<Admin> findAll() throws DAOException, EmptyResultException {
		List<Admin> adms = adminDAO.findAllAdmins();
		return adms;
	}
	
}
