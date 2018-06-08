package com.tecsup.gestion.services;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.PFR;


public interface PFRService {
	
	PFR find(int id) throws DAOException, EmptyResultException;
	
	List<PFR> findAll() throws DAOException, EmptyResultException;
	
	void update(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla, String img_carrera)
			throws DAOException;
	
	void delete(String name) throws DAOException;
	
	void create(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla, String img_carrera) throws DAOException;

	PFR findbyName(String name) throws DAOException, EmptyResultException;
	
	boolean isCarreraExist(PFR pfr) throws DAOException;
	
}
