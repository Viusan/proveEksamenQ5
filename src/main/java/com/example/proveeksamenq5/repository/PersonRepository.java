package com.example.proveeksamenq5.repository;

import com.example.proveeksamenq5.models.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {
    private final JdbcTemplate jdbcTemplate;

    public PersonRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    protected static final RowMapper<Person> personRowMapper = (rs, rowNum) ->
            new Person(
                    rs.getInt("id"),
                    rs.getString("name")
            );
    public void insertUser(Person person){
        String sql = "INSERT INTO person (id, name) VALUES(?,?)";
        jdbcTemplate.update(sql, person.getName(), person.getID());
    }
}
