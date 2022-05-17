package com.bnta.chocolate.service;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EstateService {

    @Autowired
    private EstateRepository estateRepository;

    private JdbcTemplate jdbcTemplate;

    public int insertEstate(Estate estate1){
        String sql = """
            INSERT INTO estate1(name, type)
            VALUES(?, ?)
            """;
        int rowsAffected = jdbcTemplate.update(
                sql,
                estate1.getName(),
                estate1.getCountry()
        );
        return rowsAffected;
    }

    public List<Estate> selectAllEstates() {
        String sql = """
            SELECT name, country
            FROM estate
            """;

        RowMapper<Estate> estateRowMapper = (rs, rowNum) -> {
            Estate estate1 = new Estate(
                    rs.getString("name"),
                    rs.getString("country")
            );
            return estate1;
        };

        List<Estate> estates = jdbcTemplate.query(sql, estateRowMapper);

        return estates;
    }

    public Optional<Estate> getEstateById(@PathVariable Long id){
        return estateRepository.findById(id);
    }

    public Estate getEstate() {

        return estateRepository.getById(getEstate().getId());
    }

    public List<Estate> getAll(){
        return  estateRepository.findAll();
    }

    public Estate save(Estate estate1){
        return estateRepository.save(estate1);
    }

}
