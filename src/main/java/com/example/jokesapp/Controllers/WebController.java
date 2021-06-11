package com.example.jokesapp.Controllers;

import com.example.jokesapp.Methods.DatabaseMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

@Controller
public class WebController {

    DatabaseMethods databaseMethods;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String home(Model model) throws SQLException {
        databaseMethods=new DatabaseMethods();
        model.addAttribute("jokes", databaseMethods.getAllJokes(jdbcTemplate));
        return "home";
    }

    @GetMapping("/general")
    public String general(Model model) throws SQLException {
        databaseMethods=new DatabaseMethods();
        model.addAttribute("jokes", databaseMethods.getGeneralJokes(jdbcTemplate));
        return "home";
    }

    @GetMapping("/knockknock")
    public String knockknock(Model model) throws SQLException {
        databaseMethods=new DatabaseMethods();
        model.addAttribute("jokes", databaseMethods.getKnockKnockJokes(jdbcTemplate));
        return "home";
    }

    @GetMapping("/programming")
    public String programming(Model model) throws SQLException {
        databaseMethods=new DatabaseMethods();
        model.addAttribute("jokes", databaseMethods.getProgrammingJokes(jdbcTemplate));
        return "home";
    }

}
