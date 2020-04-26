package com.perez.rest.dao;

import com.perez.rest.model.Alien;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

    List<Alien> findByTech(String tech);
}
