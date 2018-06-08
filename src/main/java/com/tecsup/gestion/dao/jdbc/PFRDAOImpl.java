package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.PFRDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.PFRMapper;
import com.tecsup.gestion.model.PFR;

@Repository
public class PFRDAOImpl implements PFRDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PFRDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public PFR findCarrera(int id) throws DAOException, EmptyResultException {
		
		String query = "SELECT * FROM pfr WHERE id = ?";
		
		Object[] params = new Object[] { id };
		
		try {

			PFR pfr = jdbcTemplate.queryForObject(query, params, new PFRMapper());
			//
			return pfr;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	@Override
	public List<PFR> findAllCarreras() throws DAOException, EmptyResultException {
		String query = "SELECT * FROM pfr";
		
		try {
			List<PFR> pfrs = jdbcTemplate.query(query, new PFRMapper());
			return pfrs;
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();	
		}catch (Exception ex) {
			logger.info("Error: " + ex.getMessage());
			throw new DAOException(ex.getMessage());
		}
	}
	
	@Override
	public PFR findCarrerabyName(String name) throws DAOException, EmptyResultException {
		
		String query = "SELECT * FROM pfr WHERE nombre = ?";
		
		Object[] params = new Object[] { name };
		
		try {
			PFR pfr = jdbcTemplate.queryForObject(query, params, new PFRMapper());
			
			return pfr;
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void create(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla,
			String img_carrera) throws DAOException {
		
		String query = "INSERT INTO pfr (nombre, Descripcion, Duracion, Sede, Objetivo, img_malla, img_carrera) VALUES (?,?,?,?,?,?,?)";
		
		Object[] params = new Object[] { name, descripcion, duracion, sede, objetivo, img_malla, img_carrera };
		
		PFR pfr = null;
		
		try {
			jdbcTemplate.update(query, params);
			
			pfr = this.findCarrerabyName(name);
			
		}catch (EmptyResultException e) {
			e.printStackTrace();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}	
		
	}

	@Override
	public void delete(String name) throws DAOException {
		
		String query = "DELETE FROM pfr WHERE nombre = ?";
		
		Object[] params = new Object[] { name };
	
		try{
			jdbcTemplate.update(query, params);
		}catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void update(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla,
			String img_carrera) throws DAOException {
		
		String query = "UPDATE pfr SET Descripcion = ?, Duracion =?, Sede = ?, Objetivo = ?, img_malla = ?, img_carrera = ? WHERE nombre = ?";
		
		Object[] params = new Object[] { descripcion, duracion, sede, objetivo, img_malla, img_carrera, name };
		
		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

}
