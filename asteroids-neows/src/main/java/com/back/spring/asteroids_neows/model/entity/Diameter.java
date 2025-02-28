package com.back.spring.asteroids_neows.model.entity;

import com.back.spring.asteroids_neows.model.entity.measures.FeetMeasure;
import com.back.spring.asteroids_neows.model.entity.measures.KilometersMeasure;
import com.back.spring.asteroids_neows.model.entity.measures.MetersMeasure;
import com.back.spring.asteroids_neows.model.entity.measures.MilesMeasure;

public class Diameter {

    private KilometersMeasure kilometers;
    private MetersMeasure meters;
    private MilesMeasure miles;
    private FeetMeasure feet;
    
    public KilometersMeasure getKilometers() {
        return kilometers;
    }
    public void setKilometers(KilometersMeasure kilometers) {
        this.kilometers = kilometers;
    }
    public MetersMeasure getMeters() {
        return meters;
    }
    public void setMeters(MetersMeasure meters) {
        this.meters = meters;
    }
    public MilesMeasure getMiles() {
        return miles;
    }
    public void setMiles(MilesMeasure miles) {
        this.miles = miles;
    }
    public FeetMeasure getFeet() {
        return feet;
    }
    public void setFeet(FeetMeasure feet) {
        this.feet = feet;
    }

    


}
