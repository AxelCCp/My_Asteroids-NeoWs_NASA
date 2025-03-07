package com.back.spring.asteroids_neows.model.dto;

public class CloseApproachDataDto {

    private String close_approach_date;
    private String close_approach_date_full;
    private Long epoch_date_close_approach;
    
    // RelativeVelocity
    private String kilometers_per_second;
    private String kilometers_per_hour;
    private String miles_per_hour;
    
    // MissDistance
    private String astronomical;
    private String lunar;
    private String kilometers;
    private String miles;
    
    private String orbiting_body;


    public CloseApproachDataDto() {}

    
    public CloseApproachDataDto(String close_approach_date, String close_approach_date_full,
            Long epoch_date_close_approach, String kilometers_per_second, String kilometers_per_hour,
            String miles_per_hour, String astronomical, String lunar, String kilometers, String miles,
            String orbiting_body) {
        this.close_approach_date = close_approach_date;
        this.close_approach_date_full = close_approach_date_full;
        this.epoch_date_close_approach = epoch_date_close_approach;
        this.kilometers_per_second = kilometers_per_second;
        this.kilometers_per_hour = kilometers_per_hour;
        this.miles_per_hour = miles_per_hour;
        this.astronomical = astronomical;
        this.lunar = lunar;
        this.kilometers = kilometers;
        this.miles = miles;
        this.orbiting_body = orbiting_body;
    }

    public String getClose_approach_date() {
        return close_approach_date;
    }

    public void setClose_approach_date(String close_approach_date) {
        this.close_approach_date = close_approach_date.toString();
    }

    public String getClose_approach_date_full() {
        return close_approach_date_full;
    }

    public void setClose_approach_date_full(String close_approach_date_full) {
        this.close_approach_date_full = close_approach_date_full.toString();
    }

    public Long getEpoch_date_close_approach() {
        return epoch_date_close_approach;
    }

    public void setEpoch_date_close_approach(Long epoch_date_close_approach) {
        this.epoch_date_close_approach = epoch_date_close_approach;
    }

    public String getKilometers_per_second() {
        return kilometers_per_second;
    }

    public void setKilometers_per_second(String kilometers_per_second) {
        this.kilometers_per_second = kilometers_per_second;
    }

    public String getKilometers_per_hour() {
        return kilometers_per_hour;
    }

    public void setKilometers_per_hour(String kilometers_per_hour) {
        this.kilometers_per_hour = kilometers_per_hour;
    }

    public String getMiles_per_hour() {
        return miles_per_hour;
    }

    public void setMiles_per_hour(String miles_per_hour) {
        this.miles_per_hour = miles_per_hour;
    }

    public String getAstronomical() {
        return astronomical;
    }

    public void setAstronomical(String astronomical) {
        this.astronomical = astronomical;
    }

    public String getLunar() {
        return lunar;
    }

    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

    public String getKilometers() {
        return kilometers;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getOrbiting_body() {
        return orbiting_body;
    }

    public void setOrbiting_body(String orbiting_body) {
        this.orbiting_body = orbiting_body;
    }


    

}
