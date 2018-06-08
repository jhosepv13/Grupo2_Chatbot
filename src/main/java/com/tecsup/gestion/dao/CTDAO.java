package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.CT;



public interface CTDAO {
	
	CT findCarreraCT(int id) throws DAOException, EmptyResultException;

	void create(String nombre, String descripcion,String aspectos, String tipo, String sede, String img_malla, String img_tecnica) throws DAOException;

	void delete(String nombre) throws DAOException;

	void update(String nombre, String descripcion,String aspectos, String tipo, String sede, String img_malla, String img_tecnica) throws DAOException;
	
	List<CT> findAllCarrerasCT() throws DAOException, EmptyResultException;
	
	CT findCarreraCTbyName(String nombre) throws DAOException, EmptyResultException;
	
}
