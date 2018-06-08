package com.tecsup.gestion.services;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Admin;

public interface SecurityService {

	
	Admin validate1(String user, String pass) throws LoginException, DAOException;

}
