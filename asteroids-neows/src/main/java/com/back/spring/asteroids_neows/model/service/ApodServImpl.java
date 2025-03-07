package com.back.spring.asteroids_neows.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.back.spring.asteroids_neows.model.entity.Apod;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ApodServImpl implements ApodServ{

    @Value("${config.base-url.endpoint.nasa2}")
    private String nasa_url_2;

    private Logger log = LoggerFactory.getLogger(ApodServImpl.class);

 
    @Override
    public Apod getApod() {

        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = null;
        Apod apod = new Apod();

        log.info("\n.............................................................................\n"
        + "[REQUEST - NASA - APOD : " + nasa_url_2 + "]" 
        + "\n.............................................................................");

        HttpGet request = new HttpGet(nasa_url_2);
        BufferedReader rd = null;

        try {

            response = client.execute(request);
            rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
            String responseline = rd.readLine();
            ObjectMapper mapper = new ObjectMapper();
    
           apod = mapper.readValue(responseline, Apod.class);

           System.out.println("APOD : " + apod);

           return apod;

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

}
