package com.tecsup.gestion.services;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Online;

public interface OnlineService {
	
	Online findOnl(int id) throws DAOException, EmptyResultException;
	
	List<Online> findAllOnl() throws DAOException, EmptyResultException;
	
	void update(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio, String objetivos, String img_curso)
			throws DAOException;
	
	void delete(String nombre) throws DAOException;
	
	void create(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio, String objetivos, String img_curso) throws DAOException;

	Online findbyNameOnl(String nombre) throws DAOException, EmptyResultException;
	
	boolean isCarreraExistOnl(Online onl) throws DAOException;
}
