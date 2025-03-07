package com.back.spring.asteroids_neows.model.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import com.back.spring.asteroids_neows.model.dto.AsteroidDto;
import com.back.spring.asteroids_neows.model.dto.mapper.AsteroidDtoMapper;
import com.back.spring.asteroids_neows.model.entity.Asteroid;
import com.back.spring.asteroids_neows.model.entity.AsteroidResult;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AsteroidResultServImpl implements AsteroidResultServ {

    @Value("${config.base-url.endpoint.nasa1}")
    private String nasa_url_1;

    private Logger log = LoggerFactory.getLogger(AsteroidResultServImpl.class);

    @SuppressWarnings("unchecked")
    @Override
    public AsteroidResult findAll() {
      
        HttpClient client = HttpClientBuilder.create().build();

        HttpResponse response = null;

        AsteroidResult asteroidResult = new AsteroidResult();
            
        log.info("\n.............................................................................\n"
                + "[REQUEST - NASA - ASTEROID : " + nasa_url_1 + "]" 
                + "\n.............................................................................");
        
        HttpGet request = new HttpGet(nasa_url_1);
        BufferedReader rd = null;
        
        try {
            
            response = client.execute(request);
            rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
            String responseline = rd.readLine();
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> map = mapper.readValue(responseline, Map.class);

            Map<String, List<Asteroid>> map_Child_1 = (Map<String, List<Asteroid>>) map.get("near_earth_objects");

            asteroidResult.setNear_earth_objects(map_Child_1);
    
            return asteroidResult;

        } catch (Exception e) {
            e.getMessage();
            return null;
        } finally {
            try {
                rd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public List<AsteroidDto>build_asteroid_dto_List(AsteroidResult asteroidResult) {

        Collection<List<Asteroid>> collection = asteroidResult.getNear_earth_objects().values();

        List<Asteroid> grant_list = new ArrayList<>();

        for(List<Asteroid> list : collection ) {
            
            grant_list.addAll(list);
        
        }

        return AsteroidDtoMapper.builder().setAsteroidList(grant_list).buildList();
        
    }

}
