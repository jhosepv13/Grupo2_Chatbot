package com.tecsup.gestion.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.CTDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.CT;

@Service
public class CTServiceImpl implements CTService{
	
	private static final Logger logger = LoggerFactory.getLogger(CTServiceImpl.class);
	
	@Autowired
	private CTDAO ctDAO;

	@Override
	public CT findCT(int id) throws DAOException, EmptyResultException {
		
		CT ct = ctDAO.findCarreraCT(id);
		return ct;
	}

	@Override
	public List<CT> findAllCT() throws DAOException, EmptyResultException {
		
		List<CT> cts = ctDAO.findAllCarrerasCT();
		return cts;
	}

	@Override
	public void update(String nombre, String descripcion, String aspectos, String tipo, String sede, String img_malla,
			String img_tecnica) throws DAOException {
		ctDAO.update(nombre, descripcion, aspectos, tipo, sede, img_malla, img_tecnica);
		
	}

	@Override
	public void delete(String nombre) throws DAOException {
		ctDAO.delete(nombre);
		
	}

	@Override
	public void create(String nombre, String descripcion, String aspectos, String tipo, String sede, String img_malla,
			String img_tecnica) throws DAOException {
		
		ctDAO.create(nombre, descripcion, aspectos, tipo, sede, img_malla, img_tecnica);
		
	}

	@Override
	public CT findbyNameCT(String nombre) throws DAOException, EmptyResultException {
		
		return ctDAO.findCarreraCTbyName(nombre);
	}

	@Override
	public boolean isCarreraCTExist(CT ct) throws DAOException {
		boolean carreraCTExist = false;
		
		try {
			this.findbyNameCT(ct.getNombre());
			carreraCTExist = true;
		}catch(EmptyResultException e){
			logger.info(e.getMessage());
		}
		return carreraCTExist;
	}

}
