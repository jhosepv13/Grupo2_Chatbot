package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.CPE;

public interface CPEDAO {
	
	CPE findCarreraCPE(int id) throws DAOException, EmptyResultException;

	void create(String nombre, String fecha_ini, String sede, String descripcion, String objetivo, String temario, int duracion,
			String area, String tipo, String precio) throws DAOException;

	void delete(String nombre) throws DAOException;

	void update(String nombre, String fecha_ini, String sede, String descripcion, String objetivo, String temario, int duracion,
			String area, String tipo, String precio) throws DAOException;
	
	List<CPE> findAllCarrerasCPE() throws DAOException, EmptyResultException;
	
	CPE findCarrerabyNameCPE(String nombre) throws DAOException, EmptyResultException;
	
}
