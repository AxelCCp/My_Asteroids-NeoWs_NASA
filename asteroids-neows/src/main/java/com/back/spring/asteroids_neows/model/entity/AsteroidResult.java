package com.back.spring.asteroids_neows.model.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class AsteroidResult implements Serializable{

    private Link links;
    private Long element_count;
    private Map<String, List<Asteroid>>near_earth_objects;

    public Link getLinks() {
        return links;
    }
    public void setLinks(Link links) {
        this.links = links;
    }
    public Long getElement_count() {
        return element_count;
    }
    public void setElement_count(Long element_count) {
        this.element_count = element_count;
    }
    public Map<String, List<Asteroid>> getNear_earth_objects() {
        return near_earth_objects;
    }
    public void setNear_earth_objects(Map<String, List<Asteroid>> near_earth_objects) {
        this.near_earth_objects = near_earth_objects;
    }
  
   

}
