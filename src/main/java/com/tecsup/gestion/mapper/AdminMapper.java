package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Admin;

public class AdminMapper implements RowMapper<Admin>{
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin adm = new Admin();
		adm.setAdmin_id(rs.getInt("id"));
		adm.setAdmin_name(rs.getString("name"));
		adm.setAdmin_password(rs.getString("password"));
		return adm;
	}
}
