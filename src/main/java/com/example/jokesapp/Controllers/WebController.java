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
        model.addAttribute("category", "All Joke Categories");
        return "home";
    }

    @GetMapping("/general")
    public String general(Model model) throws SQLException {
        databaseMethods=new DatabaseMethods();
        model.addAttribute("jokes", databaseMethods.getGeneralJokes(jdbcTemplate));
        model.addAttribute("category", "General Jokes");
        return "home";
    }

    @GetMapping("/knockknock")
    public String knockknock(Model model) throws SQLException {
        databaseMethods=new DatabaseMethods();
        model.addAttribute("jokes", databaseMethods.getKnockKnockJokes(jdbcTemplate));
        model.addAttribute("category", "Knock-Knock Jokes");
        return "home";
    }

    @GetMapping("/programming")
    public String programming(Model model) throws SQLException {
        databaseMethods=new DatabaseMethods();
        model.addAttribute("jokes", databaseMethods.getProgrammingJokes(jdbcTemplate));
        model.addAttribute("category", "Programming Jokes");
        return "home";
    }

}
