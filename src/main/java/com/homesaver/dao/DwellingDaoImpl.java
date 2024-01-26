package com.homesaver.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.homesaver.Models.Dwelling;

@Repository
public class DwellingDaoImpl implements DwellingDao {
    private final JdbcTemplate jtm;

    public DwellingDaoImpl(JdbcTemplate jtm) {
        this.jtm = jtm;
    }

    @Override
    public List<Dwelling> getAllDwellings() {
        String sql = "SELECT * from dwelling";
        List<Dwelling> dwellings = jtm.query(sql, new DwellingMapper());
        return dwellings;
    }

}
