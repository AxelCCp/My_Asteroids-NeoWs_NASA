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
import java.util.List;
import java.util.Map;
import com.back.spring.asteroids_neows.model.entity.Asteroid;
import com.back.spring.asteroids_neows.model.entity.AsteroidResult;
import com.back.spring.asteroids_neows.model.entity.Link;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AsteroidResultServImpl implements AsteroidResultServ {

    @Value("${config.base-url.endpoint.nasa1}")
    private String nasa_url_1;

    private Logger log = LoggerFactory.getLogger(AsteroidResultServImpl.class);

    @SuppressWarnings("unchecked")
    @Override
    public AsteroidResult findAll() throws IOException {
      
		HttpClient client = HttpClientBuilder.create().build();

        HttpResponse response = null;

        AsteroidResult asteroidResult = new AsteroidResult();
			
		log.info("\n.............................................................................\n"
                + "[REQUEST - NASA - 1 : " + nasa_url_1 + "]" 
                + "\n.............................................................................");
		
        HttpGet request = new HttpGet(nasa_url_1);
        BufferedReader rd = null;
		
        try {
            
            response = client.execute(request);
            rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
            String responseline = rd.readLine();
            ObjectMapper mapper = new ObjectMapper();
    
            Map<String, Object> map = mapper.readValue(responseline, Map.class);


            Link links = new Link();
            links.setNext("xxx");           //links.setNext(map.get("next").toString());
            links.setPrevious("xxx");       //links.setPrevious(map.get("previous").toString());
            links.setSelf("xxx");           //links.setSelf(map.get("self").toString());


            asteroidResult.setLinks(links);
            asteroidResult.setElement_count(Long.valueOf(map.get("element_count").toString()));


            Map<String, List<Asteroid>> map_Child_1 = (Map<String, List<Asteroid>>) map.get("near_earth_objects");

            asteroidResult.setNear_earth_objects(map_Child_1);

            /* 
            for (Map.Entry<String, List<Asteroid>> entry : map_Child_1.entrySet()) {
                String k = entry.getKey();
                List<Asteroid> v = entry.getValue();
                //System.out.println("key: " + k + ", value: " + v);

                System.out.println("-----------------------------------------------------------------");
                System.out.println("v.get(0): " + v.get(0));
                System.out.println("-----------------------------------------------------------------");
            }*/
             
            return asteroidResult;

			
		}
		catch (Exception e) {
            e.getMessage();
			return null;
		} finally {
            rd.close();
        }
    }

}
