package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.PFR;


public interface PFRDAO {

	
	PFR findCarrera(int id) throws DAOException, EmptyResultException;

	void create(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla, String img_carrera) throws DAOException;

	void delete(String name) throws DAOException;

	void update(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla, String img_carrera) throws DAOException;
	
	List<PFR> findAllCarreras() throws DAOException, EmptyResultException;
	
	PFR findCarrerabyName(String name) throws DAOException, EmptyResultException;
}
