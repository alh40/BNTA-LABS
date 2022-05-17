package com.bnta.chocolate.service;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.Optional;

@Service
public class ChocolateService {


    @Autowired
    private ChocolateRepository chocolateRepository;

    private JdbcTemplate jdbcTemplate;

    public int insertPokemon(Chocolate chocolate1) {
        String sql = """
            INSERT INTO chocolate1(name, type)
            VALUES(?, ?)
            """;
        int rowsAffected = jdbcTemplate.update(
                sql,
                chocolate1.getName(),
                chocolate1.getCocoaPercentage(),
                chocolate1.getEstate()
        );
        return rowsAffected;
    }

//    public List<Chocolate> selectAllChocolate() {
//        String sql = """
//            SELECT name, cocoaPercentage, country
//            FROM Chocolate
//            """;
//
//        RowMapper<Chocolate> chocolateRowMapper = (rs, rowNum) -> {
//            Chocolate chocolate1 = new Chocolate(
//                    rs.getString("name"),
//                    rs.getInt("cocoaPercentage"),
//                    rs.getObject("country")
//            );
//            return chocolate1;
//        };
//
//        List<Chocolate> chocolates = jdbcTemplate.query(sql, chocolateRowMapper);
//
//        return chocolates;
//    }

    public List<Chocolate> getAll(){
        return  chocolateRepository.findAll();
    }

    public Chocolate save(Chocolate chocolate1){
        return chocolateRepository.save(chocolate1);
    }

    public Optional<Chocolate> getChocolateById(@PathVariable Long id){
        return chocolateRepository.findById(id);
    }

    public Chocolate getChocolate() {
        return chocolateRepository.getById(getChocolate().getId());
    }
}
