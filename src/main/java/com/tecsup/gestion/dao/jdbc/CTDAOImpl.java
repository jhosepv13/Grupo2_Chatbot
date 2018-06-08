package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.CTDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.CTMapper;
import com.tecsup.gestion.model.CT;

@Repository
public class CTDAOImpl implements CTDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(CTDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public CT findCarreraCT(int id) throws DAOException, EmptyResultException {
		String query = "SELECT * FROM carreras_tecnicas WHERE id = ?";
		
			Object[] params = new Object[] { id };
			
			try {
	
				CT ct = jdbcTemplate.queryForObject(query, params, new CTMapper());
				//
				return ct;
				//return null;
	
			} catch (EmptyResultDataAccessException e) {
				throw new EmptyResultException();
			} catch (Exception e) {
				logger.info("Error: " + e.getMessage());
				throw new DAOException(e.getMessage());
			}
	}

	@Override
	public void create(String nombre, String descripcion, String aspectos, String tipo, String sede, String img_malla,
			String img_tecnica) throws DAOException {
		
		String query = "INSERT INTO carreras_tecnicas (Nombre, Descripcion, Aspectos, Tipo, Sede, img_malla, img_tecnica) VALUES (?,?,?,?,?,?,?)";
				
				Object[] params = new Object[] { nombre, descripcion, aspectos, tipo, sede, img_malla, img_tecnica };
				
				CT ct = null;
				
				try {
					jdbcTemplate.update(query, params);
					
					ct = this.findCarreraCTbyName(nombre);
					
				}catch (EmptyResultException e) {
					e.printStackTrace();
				} catch (Exception e) {
					logger.info("Error: " + e.getMessage());
					throw new DAOException(e.getMessage());
				}	
		
	}

	@Override
	public void delete(String nombre) throws DAOException {
		
		String query = "DELETE FROM carreras_tecnicas WHERE Nombre = ?";
				
				Object[] params = new Object[] { nombre };
			
				try{
					jdbcTemplate.update(query, params);
				}catch (Exception e) {
					logger.info("Error: " + e.getMessage());
					throw new DAOException(e.getMessage());
				}
		
	}

	@Override
	public void update(String nombre, String descripcion, String aspectos, String tipo, String sede, String img_malla,
			String img_tecnica) throws DAOException {
		
		String query = "UPDATE carreras_tecnicas SET Descripcion = ?, Aspectos =?, Tipo = ?, Sede = ?, img_malla = ?, img_tecnica = ? WHERE Nombre = ?";
				
				Object[] params = new Object[] { descripcion, aspectos, tipo, sede, img_malla, img_tecnica, nombre };
				
				try {
					jdbcTemplate.update(query, params);
				} catch (Exception e) {
					logger.info("Error: " + e.getMessage());
					throw new DAOException(e.getMessage());
				}
		
	}

	@Override
	public List<CT> findAllCarrerasCT() throws DAOException, EmptyResultException {
		String query = "SELECT * FROM carreras_tecnicas";
		
		try {
			List<CT> cts = jdbcTemplate.query(query, new CTMapper());
			return cts;
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();	
		}catch (Exception ex) {
			logger.info("Error: " + ex.getMessage());
			throw new DAOException(ex.getMessage());
		}
	}

	@Override
	public CT findCarreraCTbyName(String nombre) throws DAOException, EmptyResultException {
		
		String query = "SELECT * FROM carreras_tecnicas WHERE Nombre = ?";
				
				Object[] params = new Object[] { nombre };
				
				try {
					CT ct = jdbcTemplate.queryForObject(query, params, new CTMapper());
					
					return ct;
				}catch (EmptyResultDataAccessException e) {
					throw new EmptyResultException();
				} catch (Exception e) {
					logger.info("Error: " + e.getMessage());
					throw new DAOException(e.getMessage());
				}
		
	}

}
