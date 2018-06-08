package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Online;

public class OnlineMapper implements RowMapper<Online>{

	@Override
	public Online mapRow(ResultSet rs, int rowNum) throws SQLException {
		Online onl = new Online();
		onl.setOnl_id(rs.getInt("id"));
		onl.setNombre(rs.getString("Nombre"));
		onl.setDescripcion(rs.getString("Descripcion"));
		onl.setFecha_ini(rs.getString("Fech_inic"));
		onl.setFecha_fin(rs.getString("Fech_fin"));
		onl.setPrecio(rs.getString("precio"));
		onl.setObjetivos(rs.getString("objetivos"));
		onl.setImg_curso(rs.getString("img_curso"));
		
		return onl;
	}
	
}
