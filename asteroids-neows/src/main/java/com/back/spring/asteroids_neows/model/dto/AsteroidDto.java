package com.back.spring.asteroids_neows.model.dto;

import java.util.List;


public class AsteroidDto {

    private String link_asteroid;
    private String id;
    private String neo_reference_id;
    private String name;
    private String nasa_jpl_url; 
    private Double absolute_magnitude_h;
    
    // Diameter
    private Double feet_estimated_diameter_min;
    private Double feet_estimated_diameter_max;
    private Double meter_estimated_diameter_min;
    private Double meter_estimated_diameter_max;
    private Double kilometer_estimated_diameter_min;
    private Double kilometer_estimated_diameter_max;
    private Double mile_estimated_diameter_min;
    private Double mile_estimated_diameter_max;
    
    private Boolean is_potentially_hazardous_asteroid;
    private List<CloseApproachDataDto> close_approach_data_dto;
    private Boolean is_sentry_object;
    private String sentry_data;


    public AsteroidDto() {}


    public AsteroidDto(String link_asteroid, String id, String neo_reference_id, String name, String nasa_jpl_url,
            Double absolute_magnitude_h, Double feet_estimated_diameter_min, Double feet_estimated_diameter_max,
            Double meter_estimated_diameter_min, Double meter_estimated_diameter_max,
            Double kilometer_estimated_diameter_min, Double kilometer_estimated_diameter_max,
            Double mile_estimated_diameter_min, Double mile_estimated_diameter_max,
            Boolean is_potentially_hazardous_asteroid, List<CloseApproachDataDto> close_approach_data_dto,
            Boolean is_sentry_object, String sentry_data) {
                
        this.link_asteroid = link_asteroid;
        this.id = id;
        this.neo_reference_id = neo_reference_id;
        this.name = name;
        this.nasa_jpl_url = nasa_jpl_url;
        this.absolute_magnitude_h = absolute_magnitude_h;
        this.feet_estimated_diameter_min = feet_estimated_diameter_min;
        this.feet_estimated_diameter_max = feet_estimated_diameter_max;
        this.meter_estimated_diameter_min = meter_estimated_diameter_min;
        this.meter_estimated_diameter_max = meter_estimated_diameter_max;
        this.kilometer_estimated_diameter_min = kilometer_estimated_diameter_min;
        this.kilometer_estimated_diameter_max = kilometer_estimated_diameter_max;
        this.mile_estimated_diameter_min = mile_estimated_diameter_min;
        this.mile_estimated_diameter_max = mile_estimated_diameter_max;
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
        this.close_approach_data_dto = close_approach_data_dto;
        this.is_sentry_object = is_sentry_object;
        this.sentry_data = sentry_data;
    }

    public String getLink_asteroid() {
        return link_asteroid;
    }

    public void setLink_asteroid(String link_asteroid) {
        this.link_asteroid = link_asteroid;
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

    public Double getFeet_estimated_diameter_min() {
        return feet_estimated_diameter_min;
    }

    public void setFeet_estimated_diameter_min(Double feet_estimated_diameter_min) {
        this.feet_estimated_diameter_min = feet_estimated_diameter_min;
    }

    public Double getFeet_estimated_diameter_max() {
        return feet_estimated_diameter_max;
    }

    public void setFeet_estimated_diameter_max(Double feet_estimated_diameter_max) {
        this.feet_estimated_diameter_max = feet_estimated_diameter_max;
    }

    public Double getMeter_estimated_diameter_min() {
        return meter_estimated_diameter_min;
    }

    public void setMeter_estimated_diameter_min(Double meter_estimated_diameter_min) {
        this.meter_estimated_diameter_min = meter_estimated_diameter_min;
    }

    public Double getMeter_estimated_diameter_max() {
        return meter_estimated_diameter_max;
    }

    public void setMeter_estimated_diameter_max(Double meter_estimated_diameter_max) {
        this.meter_estimated_diameter_max = meter_estimated_diameter_max;
    }

    public Double getKilometer_estimated_diameter_min() {
        return kilometer_estimated_diameter_min;
    }

    public void setKilometer_estimated_diameter_min(Double kilometer_estimated_diameter_min) {
        this.kilometer_estimated_diameter_min = kilometer_estimated_diameter_min;
    }

    public Double getKilometer_estimated_diameter_max() {
        return kilometer_estimated_diameter_max;
    }

    public void setKilometer_estimated_diameter_max(Double kilometer_estimated_diameter_max) {
        this.kilometer_estimated_diameter_max = kilometer_estimated_diameter_max;
    }

    public Double getMile_estimated_diameter_min() {
        return mile_estimated_diameter_min;
    }

    public void setMile_estimated_diameter_min(Double mile_estimated_diameter_min) {
        this.mile_estimated_diameter_min = mile_estimated_diameter_min;
    }

    public Double getMile_estimated_diameter_max() {
        return mile_estimated_diameter_max;
    }

    public void setMile_estimated_diameter_max(Double mile_estimated_diameter_max) {
        this.mile_estimated_diameter_max = mile_estimated_diameter_max;
    }

    public Boolean getIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setIs_potentially_hazardous_asteroid(Boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public List<CloseApproachDataDto> getClose_approach_data_dto() {
        return close_approach_data_dto;
    }

    public void setClose_approach_data_dto(List<CloseApproachDataDto> close_approach_data_dto) {
        this.close_approach_data_dto = close_approach_data_dto;
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
