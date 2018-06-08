package com.tecsup.gestion.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.PFRDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.PFR;

@Service
public class PFRServiceImpl implements PFRService{
	
	private static final Logger logger = LoggerFactory.getLogger(PFRServiceImpl.class);
	
	@Autowired
	private PFRDAO pfrDAO;

	@Override
	public List<PFR> findAll() throws DAOException, EmptyResultException {
		List<PFR> pfrs = pfrDAO.findAllCarreras();
		return pfrs;
	}

	@Override
	public void update(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla,
			String img_carrera) throws DAOException {
		
		pfrDAO.update(name, descripcion, duracion, sede, objetivo, img_malla, img_carrera);
		
	}

	@Override
	public PFR find(int id) throws DAOException, EmptyResultException {
		
		PFR pfr = pfrDAO.findCarrera(id);
		return pfr;
	}

	@Override
	public void delete(String name) throws DAOException {
		pfrDAO.delete(name);
		
	}

	@Override
	public void create(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla,
			String img_carrera) throws DAOException {
		pfrDAO.create(name, descripcion, duracion, sede, objetivo, img_malla, img_carrera);
		
	}

	@Override
	public PFR findbyName(String name) throws DAOException, EmptyResultException {
		
		return pfrDAO.findCarrerabyName(name);
	}

	@Override
	public boolean isCarreraExist(PFR pfr) throws DAOException {
		boolean carreraExist = false;
		
		try {
			this.findbyName(pfr.getName());
			carreraExist = true;
		}catch(EmptyResultException e){
			logger.info(e.getMessage());
		}
		return carreraExist;
	}
	
}
