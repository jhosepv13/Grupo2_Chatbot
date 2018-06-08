package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.CT;

public class CTMapper implements RowMapper<CT>{

	@Override
	public CT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CT ct = new CT();
		ct.setCt_id(rs.getInt("id"));
		ct.setNombre(rs.getString("Nombre"));
		ct.setDescripcion(rs.getString("Descripcion"));
		ct.setAspectos(rs.getString("Aspectos"));
		ct.setTipo(rs.getString("Tipo"));
		ct.setSede(rs.getString("Sede"));
		ct.setImg_malla(rs.getString("img_malla"));
		ct.setImg_tecnica(rs.getString("img_tecnica"));
		
		return ct;
	}

}
