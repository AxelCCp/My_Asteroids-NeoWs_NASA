package com.back.spring.asteroids_neows.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.spring.asteroids_neows.model.dto.AsteroidDto;
import com.back.spring.asteroids_neows.model.entity.AsteroidResult;
import com.back.spring.asteroids_neows.model.entity.Test;
import com.back.spring.asteroids_neows.model.service.AsteroidResultServ;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/AsteroidResult")
public class AsteroidResultRest {


    @Autowired
    private AsteroidResultServ asteroidResultServ;
 
    @GetMapping("/list")
    public List<AsteroidDto> listAll() {

        AsteroidResult asteroidResult = this.asteroidResultServ.findAll();

        List<AsteroidDto> asteroid_dto_list = this.asteroidResultServ.build_asteroid_dto_List(asteroidResult);

        return asteroid_dto_list;   
    }

    @GetMapping("/test")
    public List<Test> test () {

        Test test = new Test();
        test.setName("Rey Pilaf");
        test.setEmail("xxxx@xxxx.jp");

        List<Test> list = new ArrayList<>();

        list.add(test);

        return list;
    } 
    
}
