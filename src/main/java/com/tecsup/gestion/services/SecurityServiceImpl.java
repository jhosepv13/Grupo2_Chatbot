package com.tecsup.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.AdminDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Admin;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private AdminDAO adminDAO;


	@Override
	public Admin validate1(String user, String pass) throws LoginException, DAOException {
		Admin adm = adminDAO.validate1(user, pass);
		
		return adm;
	}

}
