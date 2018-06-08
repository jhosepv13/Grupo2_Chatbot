package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Online;

public interface OnlineDAO {
	
	Online findCarreraOnl(int id) throws DAOException, EmptyResultException;

	void create(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio, String objetivos, String img_curso) throws DAOException;

	void delete(String nombre) throws DAOException;

	void update(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio, String objetivos, String img_curso) throws DAOException;
	
	List<Online> findAllCarrerasOnl() throws DAOException, EmptyResultException;
	
	Online findCarrerabyNameOnl(String nombre) throws DAOException, EmptyResultException;
	
}
