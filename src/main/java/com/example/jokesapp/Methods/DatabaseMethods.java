package com.example.jokesapp.Methods;


import com.example.jokesapp.Models.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class DatabaseMethods {


    public ArrayList<Joke> getAllJokes(JdbcTemplate jdbcTemplate) throws SQLException {
        ArrayList<Joke> jokes = new ArrayList<>();
        String query = "SELECT * FROM joke";
        if(jdbcTemplate.getDataSource()==null){
            System.out.println("Data Source is Null");
        }
        Connection con = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet resultSet = ps.executeQuery();
        while(resultSet.next()){
            jokes.add(new Joke(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
        }
        return jokes;
    }
}


