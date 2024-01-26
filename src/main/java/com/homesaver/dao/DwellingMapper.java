package com.homesaver.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.homesaver.Models.Dwelling;

public class DwellingMapper implements RowMapper<Dwelling> {

    public Dwelling mapRow(ResultSet rs, int rowNum) throws SQLException {
        Dwelling d = new Dwelling();
        d.setId(rs.getInt("id"));
        d.setDwellingType(rs.getString("type"));
        d.setAddress(rs.getString("address"));
        d.setUserId(rs.getInt("userid"));
        return d;
    }
}
