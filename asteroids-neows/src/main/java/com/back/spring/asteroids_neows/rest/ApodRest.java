package com.back.spring.asteroids_neows.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.spring.asteroids_neows.model.entity.Apod;
import com.back.spring.asteroids_neows.model.service.ApodServ;

@RestController
@RequestMapping("apod")
public class ApodRest {

    @Autowired
    private ApodServ apodServ;

    @GetMapping
    public Apod getApod() {
        return apodServ.getApod();
    } 

}
