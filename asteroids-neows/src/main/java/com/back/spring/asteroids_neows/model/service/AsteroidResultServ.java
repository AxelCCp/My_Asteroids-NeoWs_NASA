package com.back.spring.asteroids_neows.model.service;

import java.io.IOException;

import com.back.spring.asteroids_neows.model.entity.AsteroidResult;

public interface AsteroidResultServ {


    AsteroidResult findAll() throws IOException;

}
