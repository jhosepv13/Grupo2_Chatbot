package com.tecsup.gestion.services;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.CT;


public interface CTService {
	
	CT findCT(int id) throws DAOException, EmptyResultException;
	
	List<CT> findAllCT() throws DAOException, EmptyResultException;
	
	void update(String nombre, String descripcion, String aspectos, String tipo, String sede, String img_malla, String img_tecnica)
			throws DAOException;
	
	void delete(String nombre) throws DAOException;
	
	void create(String nombre, String descripcion, String aspectos, String tipo, String sede, String img_malla, String img_tecnica) throws DAOException;

	CT findbyNameCT(String nombre) throws DAOException, EmptyResultException;
	
	boolean isCarreraCTExist(CT ct) throws DAOException;
	
}
