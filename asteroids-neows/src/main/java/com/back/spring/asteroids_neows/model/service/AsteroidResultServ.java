package com.back.spring.asteroids_neows.model.service;

import java.util.List;

import com.back.spring.asteroids_neows.model.dto.AsteroidDto;
import com.back.spring.asteroids_neows.model.entity.AsteroidResult;

public interface AsteroidResultServ {


    AsteroidResult findAll();

    List<AsteroidDto> build_asteroid_dto_List(AsteroidResult asteroidResult);

}
