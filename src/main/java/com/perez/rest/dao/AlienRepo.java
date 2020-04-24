package com.perez.rest.dao;

import com.perez.rest.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
}
