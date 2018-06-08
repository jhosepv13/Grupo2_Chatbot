package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.PFR;

public class PFRMapper implements RowMapper<PFR>{

	@Override
	public PFR mapRow(ResultSet rs, int rowNum) throws SQLException {
		PFR pfr = new PFR();
		pfr.setPfr_id(rs.getInt("id"));
		pfr.setName(rs.getString("nombre"));
		pfr.setDescripcion(rs.getString("Descripcion"));
		pfr.setDuracion(rs.getInt("Duracion"));
		pfr.setSede(rs.getString("Sede"));
		pfr.setObjetivo(rs.getString("Objetivo"));
		pfr.setImg_malla(rs.getString("img_malla"));
		pfr.setImg_carrera(rs.getString("img_carrera"));
		return pfr;
	}
	
}
