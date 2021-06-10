package com.example.jokesapp.Repositories;

import com.example.jokesapp.Models.Joke;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface JokeRepository extends CrudRepository<Joke, Integer> {

    @Query(value = "SELECT * FROM jokes.joke", nativeQuery = true)
    Collection<Joke> getAllJokes();
}
