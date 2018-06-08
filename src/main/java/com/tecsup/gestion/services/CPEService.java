package com.tecsup.gestion.services;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.CPE;

public interface CPEService {
	
	CPE findCPE(int id) throws DAOException, EmptyResultException;
	
	List<CPE> findAllCPE() throws DAOException, EmptyResultException;
	
	void update(String nombre, String fecha_ini, String sede, String descripcion, String objetivo, String temario, int duracion,
			String area, String tipo, String precio)
			throws DAOException;
	
	void delete(String nombre) throws DAOException;
	
	void create(String nombre, String fecha_ini, String sede, String descripcion, String objetivo, String temario, int duracion,
			String area, String tipo, String precio) throws DAOException;

	CPE findbyNameCPE(String nombre) throws DAOException, EmptyResultException;
	
	boolean isCarreraExistCPE(CPE cpe) throws DAOException;
}
