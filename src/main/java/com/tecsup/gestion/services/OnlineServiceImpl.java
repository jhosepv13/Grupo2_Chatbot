package com.tecsup.gestion.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.OnlineDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Online;

@Service
public class OnlineServiceImpl implements OnlineService{
	
	private static final Logger logger = LoggerFactory.getLogger(OnlineServiceImpl.class);
	
	@Autowired
	private OnlineDAO onlineDAO;

	@Override
	public Online findOnl(int id) throws DAOException, EmptyResultException {

		Online onl = onlineDAO.findCarreraOnl(id);
		return onl;
	}

	@Override
	public List<Online> findAllOnl() throws DAOException, EmptyResultException {
		
		List<Online> onls = onlineDAO.findAllCarrerasOnl();
		return onls;
	}

	@Override
	public void update(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio,
			String objetivos, String img_curso) throws DAOException {
		onlineDAO.update(nombre, descripcion, fecha_ini, fecha_fin, precio, objetivos, img_curso);
		
	}

	@Override
	public void delete(String nombre) throws DAOException {
		onlineDAO.delete(nombre);
		
	}

	@Override
	public void create(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio,
			String objetivos, String img_curso) throws DAOException {
		onlineDAO.create(nombre, descripcion, fecha_ini, fecha_fin, precio, objetivos, img_curso);
		
	}

	@Override
	public Online findbyNameOnl(String nombre) throws DAOException, EmptyResultException {
		
		return onlineDAO.findCarrerabyNameOnl(nombre);
	}

	@Override
	public boolean isCarreraExistOnl(Online onl) throws DAOException {
		boolean carreraExistOnl = false;
		
		try {
			this.findbyNameOnl(onl.getNombre());
			carreraExistOnl = true;
		}catch(EmptyResultException e){
			logger.info(e.getMessage());
		}
		return carreraExistOnl;
	}
	
	
}
