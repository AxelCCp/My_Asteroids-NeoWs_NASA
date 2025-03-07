package com.back.spring.asteroids_neows.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Asteroid {  
    
    private Link links;
    private String id;
    private String neo_reference_id;
    private String name;
    private String nasa_jpl_url; 
    private Double absolute_magnitude_h;
    private Diameter estimated_diameter;
    private Boolean is_potentially_hazardous_asteroid;
    private List<CloseApproachData> close_approach_data;
    private Boolean is_sentry_object;
    private String sentry_data;

    public Asteroid(){
        this.close_approach_data = new ArrayList<>();
    }

    public Link getLinks() {
        return links;
    }
    public void setLinks(Link links) {
        this.links = links;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNeo_reference_id() {
        return neo_reference_id;
    }
    public void setNeo_reference_id(String neo_reference_id) {
        this.neo_reference_id = neo_reference_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNasa_jpl_url() {
        return nasa_jpl_url;
    }
    public void setNasa_jpl_url(String nasa_jpl_url) {
        this.nasa_jpl_url = nasa_jpl_url;
    }
    public Double getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }
    public void setAbsolute_magnitude_h(Double absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }
    public Diameter getEstimated_diameter() {
        return estimated_diameter;
    }
    public void setEstimated_diameter(Diameter estimated_diameter) {
        this.estimated_diameter = estimated_diameter;
    }
    public Boolean getIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }
    public void setIs_potentially_hazardous_asteroid(Boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }
    public List<CloseApproachData> getClose_approach_data() {
        return close_approach_data;
    }
    public void setClose_approach_data(List<CloseApproachData> close_approach_data) {
        this.close_approach_data = close_approach_data;
    }

    public Boolean getIs_sentry_object() {
        return is_sentry_object;
    }

    public void setIs_sentry_object(Boolean is_sentry_object) {
        this.is_sentry_object = is_sentry_object;
    }

    public String getSentry_data() {
        return sentry_data;
    }

    public void setSentry_data(String sentry_data) {
        this.sentry_data = sentry_data;
    }

    




}
