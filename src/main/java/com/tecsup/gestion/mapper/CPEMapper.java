package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.CPE;

public class CPEMapper implements RowMapper<CPE> {

	@Override
	public CPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CPE cpe = new CPE();
		cpe.setCpd_id(rs.getInt("id"));
		cpe.setNombre(rs.getString("Nombre"));
		cpe.setFecha_ini(rs.getString("fec_inic"));
		cpe.setSede(rs.getString("Sede"));
		cpe.setDescripcion(rs.getString("Descripcion"));
		cpe.setObjetivo(rs.getString("Objetivo"));
		cpe.setTemario(rs.getString("Temario"));
		cpe.setDuracion(rs.getInt("Duracion"));
		cpe.setArea(rs.getString("Area"));
		cpe.setTipo(rs.getString("Tipo"));
		cpe.setPrecio(rs.getString("Precio"));
		
		return cpe;
	}

}
