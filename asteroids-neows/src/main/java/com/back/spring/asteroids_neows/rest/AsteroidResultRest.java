package com.back.spring.asteroids_neows.rest;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.back.spring.asteroids_neows.model.entity.AsteroidResult;
import com.back.spring.asteroids_neows.model.service.AsteroidResultServ;


@RestController
@RequestMapping("/AsteroidResult")
public class AsteroidResultRest {


    @Autowired
    private AsteroidResultServ asteroidResultServ;
 
    @GetMapping("/list")
    public AsteroidResult listAll() throws IOException {

        return this.asteroidResultServ.findAll();

     
        
    }

    
}
