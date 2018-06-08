package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.OnlineDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.OnlineMapper;
import com.tecsup.gestion.model.Online;

@Repository
public class OnlineDAOImpl implements OnlineDAO {

	private static final Logger logger = LoggerFactory.getLogger(OnlineDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Online findCarreraOnl(int id) throws DAOException, EmptyResultException {
		String query = "SELECT * FROM cursoonline WHERE id = ?";
		
		Object[] params = new Object[] { id };
		
		try {

			Online onl = jdbcTemplate.queryForObject(query, params, new OnlineMapper());
			//
			return onl;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void create(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio,
			String objetivos, String img_curso) throws DAOException {
		
		String query = "INSERT INTO cursoonline (Nombre, Descripcion, Fecha_inic, Fecha_fin, precio, objetivos, img_curso) VALUES (?,?,?,?,?,?,?)";
		
		Object[] params = new Object[] { nombre, descripcion, fecha_ini, fecha_fin, precio, objetivos, img_curso };
		
		Online onl = null;
		
		try {
			jdbcTemplate.update(query, params);
			
			onl = this.findCarrerabyNameOnl(nombre);
			
		}catch (EmptyResultException e) {
			e.printStackTrace();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}	
		
	}

	@Override
	public void delete(String nombre) throws DAOException {
		
		String query = "DELETE FROM cursoonline WHERE Nombre = ?";
		
		Object[] params = new Object[] { nombre };
	
		try{
			jdbcTemplate.update(query, params);
		}catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void update(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio,
			String objetivos, String img_curso) throws DAOException {
		
		String query = "UPDATE cursoonline SET Descripcion = ?, Fecha_inic =?, Fecha_fin = ?, precio = ?, objetivos = ?, img_curso = ? WHERE Nombre = ?";
		
		Object[] params = new Object[] { descripcion, fecha_ini, fecha_fin, precio, objetivos, img_curso, nombre };
		
		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public List<Online> findAllCarrerasOnl() throws DAOException, EmptyResultException {
		String query = "SELECT * FROM cursoonline";
		
		try {
			List<Online> onls = jdbcTemplate.query(query, new OnlineMapper());
			return onls;
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();	
		}catch (Exception ex) {
			logger.info("Error: " + ex.getMessage());
			throw new DAOException(ex.getMessage());
		}
	}

	@Override
	public Online findCarrerabyNameOnl(String nombre) throws DAOException, EmptyResultException {
		String query = "SELECT * FROM cursoonline WHERE Nombre = ?";
		
		Object[] params = new Object[] { nombre };
		
		try {
			Online onl = jdbcTemplate.queryForObject(query, params, new OnlineMapper());
			
			return onl;
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}

	}
	
	
	
}
