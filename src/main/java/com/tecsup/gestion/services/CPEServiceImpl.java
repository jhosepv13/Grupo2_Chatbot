package com.tecsup.gestion.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.CPEDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.CPE;

@Service
public class CPEServiceImpl implements CPEService {

	private static final Logger logger = LoggerFactory.getLogger(CPEServiceImpl.class);
	
	@Autowired
	private CPEDAO cpeDAO;
	
	@Override
	public CPE findCPE(int id) throws DAOException, EmptyResultException {
		CPE cpe = cpeDAO.findCarreraCPE(id);
		return cpe;
	}

	@Override
	public List<CPE> findAllCPE() throws DAOException, EmptyResultException {
		List<CPE> cpes = cpeDAO.findAllCarrerasCPE();
		return cpes;
	}

	@Override
	public void update(String nombre, String fecha_ini, String sede, String descripcion, String objetivo,
			String temario, int duracion, String area, String tipo, String precio) throws DAOException {
		cpeDAO.update(nombre, fecha_ini, sede, descripcion, objetivo, temario, duracion, area, tipo, precio);
		
	}

	@Override
	public void delete(String nombre) throws DAOException {
		cpeDAO.delete(nombre);
		
	}

	@Override
	public void create(String nombre, String fecha_ini, String sede, String descripcion, String objetivo,
			String temario, int duracion, String area, String tipo, String precio) throws DAOException {
		cpeDAO.create(nombre, fecha_ini, sede, descripcion, objetivo, temario, duracion, area, tipo, precio);
		
	}

	@Override
	public CPE findbyNameCPE(String nombre) throws DAOException, EmptyResultException {
		return cpeDAO.findCarrerabyNameCPE(nombre);
	}

	@Override
	public boolean isCarreraExistCPE(CPE cpe) throws DAOException {
		boolean carreraExistCPE = false;
		
		try {
			this.findbyNameCPE(cpe.getNombre());
			 carreraExistCPE = true;
		}catch(EmptyResultException e){
			logger.info(e.getMessage());
		}
		return  carreraExistCPE;
	}

}
