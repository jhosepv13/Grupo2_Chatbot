package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.CPEDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.CPEMapper;
import com.tecsup.gestion.model.CPE;


@Repository
public class CPEDAOImpl implements CPEDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(CPEDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public CPE findCarreraCPE(int id) throws DAOException, EmptyResultException {
		String query = "SELECT * FROM cpe WHERE id = ?";
		
		Object[] params = new Object[] { id };
		
		try {

			CPE cpe = jdbcTemplate.queryForObject(query, params, new CPEMapper());
			//
			return cpe;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void create(String nombre, String fecha_ini, String sede, String descripcion, String objetivo,
			String temario, int duracion, String area, String tipo, String precio) throws DAOException {
		
		String query = "INSERT INTO cpe (Nombre, fec_inic, Sede, Descripcion, Objetivo, Temario, Duracion, Area, Tipo, Precio ) VALUES (?,?,?,?,?,?,?,?,?,?)";
		
		Object[] params = new Object[] { nombre, fecha_ini, sede, descripcion, objetivo, temario, duracion, area, tipo, precio };
		
		CPE cpe = null;
		
		try {
			jdbcTemplate.update(query, params);
			
			cpe = this.findCarrerabyNameCPE(nombre);
			
		}catch (EmptyResultException e) {
			e.printStackTrace();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}	
		
	}

	@Override
	public void delete(String nombre) throws DAOException {
		String query = "DELETE FROM cpe WHERE Nombre = ?";
		
		Object[] params = new Object[] { nombre };
	
		try{
			jdbcTemplate.update(query, params);
		}catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void update(String nombre, String fecha_ini, String sede, String descripcion, String objetivo,
			String temario, int duracion, String area, String tipo, String precio) throws DAOException {
		
		String query = "UPDATE cpe SET fec_inic = ?, Sede = ?, Descripcion = ?, Objetivo = ?, Temario = ?, Duracion = ?, Area = ?, Tipo = ?, Precio = ? WHERE Nombre = ?";
		
		Object[] params = new Object[] { fecha_ini, sede, descripcion, objetivo, temario, duracion, area, tipo, precio, nombre };
		
		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public List<CPE> findAllCarrerasCPE() throws DAOException, EmptyResultException {
	String query = "SELECT * FROM cpe";
			
			try {
				List<CPE> cpes = jdbcTemplate.query(query, new CPEMapper());
				return cpes;
			}catch (EmptyResultDataAccessException e) {
				throw new EmptyResultException();	
			}catch (Exception ex) {
				logger.info("Error: " + ex.getMessage());
				throw new DAOException(ex.getMessage());
			}
	}

	@Override
	public CPE findCarrerabyNameCPE(String nombre) throws DAOException, EmptyResultException {
		String query = "SELECT * FROM cpe WHERE Nombre = ?";
		
		Object[] params = new Object[] { nombre };
		
		try {
			CPE cpe = jdbcTemplate.queryForObject(query, params, new CPEMapper());
			
			return cpe;
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

}
