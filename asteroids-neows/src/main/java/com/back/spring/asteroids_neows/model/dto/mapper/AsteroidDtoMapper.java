package com.back.spring.asteroids_neows.model.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.back.spring.asteroids_neows.model.dto.AsteroidDto;
import com.back.spring.asteroids_neows.model.dto.CloseApproachDataDto;
import com.back.spring.asteroids_neows.model.entity.Asteroid;
import com.back.spring.asteroids_neows.model.entity.CloseApproachData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class AsteroidDtoMapper {

    private Asteroid asteroid;
    private List<Asteroid>asteroidList;


    private AsteroidDtoMapper() {}


    public static AsteroidDtoMapper builder() {
        return new AsteroidDtoMapper();
    }


    public AsteroidDtoMapper setAsteroid(Asteroid asteroid) {
        this.asteroid = asteroid;
        return this;
    }


    public AsteroidDtoMapper setAsteroidList(List<Asteroid>asteroidList) {
        this.asteroidList = asteroidList;
        return this;
    }



    public AsteroidDto build_asteroid_Dto() {
        
        if(this.asteroid == null){
            throw new RuntimeException("You should pass an asteroid object!");
        }

        List<CloseApproachData> closeApproachData_list = this.asteroid.getClose_approach_data();
        List<CloseApproachDataDto>  closeApproachData_Dto_list = new ArrayList<>();

        for(CloseApproachData c: closeApproachData_list) {
            //generar objeto
            CloseApproachDataDto closeApproachDataDto = new CloseApproachDataDto();
            //cargar obj
            closeApproachDataDto.setClose_approach_date(c.getClose_approach_date());
            closeApproachDataDto.setClose_approach_date_full(c.getClose_approach_date_full());
            closeApproachDataDto.setEpoch_date_close_approach(c.getEpoch_date_close_approach());
            closeApproachDataDto.setKilometers_per_second(c.getRelative_velocity().getKilometers_per_second());
            closeApproachDataDto.setKilometers_per_hour(c.getRelative_velocity().getKilometers_per_hour());
            closeApproachDataDto.setMiles_per_hour(c.getRelative_velocity().getMiles_per_hour());
            closeApproachDataDto.setAstronomical(c.getMiss_distance().getAstronomical());
            closeApproachDataDto.setLunar(c.getMiss_distance().getLunar());
            closeApproachDataDto.setKilometers(c.getMiss_distance().getKilometers());
            closeApproachDataDto.setMiles(c.getMiss_distance().getMiles());
            closeApproachDataDto.setOrbiting_body(c.getOrbiting_body());
            //cargar lista
            closeApproachData_Dto_list.add(closeApproachDataDto);
        }
                
        return new AsteroidDto(asteroid.getLinks().getSelf(), asteroid.getId(), asteroid.getNeo_reference_id(),
                                asteroid.getName(), asteroid.getNasa_jpl_url(), asteroid.getAbsolute_magnitude_h(),
                                asteroid.getEstimated_diameter().getFeet().getEstimated_diameter_min(),
                                asteroid.getEstimated_diameter().getFeet().getEstimated_diameter_max(),
                                asteroid.getEstimated_diameter().getMeters().getEstimated_diameter_min(),
                                asteroid.getEstimated_diameter().getMeters().getEstimated_diameter_max(),
                                asteroid.getEstimated_diameter().getKilometers().getEstimated_diameter_min(),
                                asteroid.getEstimated_diameter().getKilometers().getEstimated_diameter_max(),
                                asteroid.getEstimated_diameter().getMiles().getEstimated_diameter_min(),
                                asteroid.getEstimated_diameter().getMiles().getEstimated_diameter_max(),
                                asteroid.getIs_potentially_hazardous_asteroid(),
                                closeApproachData_Dto_list,
                                asteroid.getIs_sentry_object(),
                                asteroid.getSentry_data());
    }


    public List<AsteroidDto> buildList() {

        if(this.asteroidList == null){
            throw new RuntimeException("You should pass an asteroid object!");
        }

        List<AsteroidDto> asteroid_dto_List = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();

        for(Asteroid a : mapper.convertValue(this.asteroidList, new TypeReference <List<Asteroid>>(){})) {

            List<CloseApproachData> closeApproachData_list = a.getClose_approach_data();

            List<CloseApproachDataDto>  closeApproachData_Dto_list = new ArrayList<>();

            for(CloseApproachData c: closeApproachData_list) {
                //generar objeto
                CloseApproachDataDto closeApproachDataDto = new CloseApproachDataDto();
                //cargar obj
                closeApproachDataDto.setClose_approach_date(c.getClose_approach_date());
                closeApproachDataDto.setClose_approach_date_full(c.getClose_approach_date_full());
                closeApproachDataDto.setEpoch_date_close_approach(c.getEpoch_date_close_approach());
                closeApproachDataDto.setKilometers_per_second(c.getRelative_velocity().getKilometers_per_second());
                closeApproachDataDto.setKilometers_per_hour(c.getRelative_velocity().getKilometers_per_hour());
                closeApproachDataDto.setMiles_per_hour(c.getRelative_velocity().getMiles_per_hour());
                closeApproachDataDto.setAstronomical(c.getMiss_distance().getAstronomical());
                closeApproachDataDto.setLunar(c.getMiss_distance().getLunar());
                closeApproachDataDto.setKilometers(c.getMiss_distance().getKilometers());
                closeApproachDataDto.setMiles(c.getMiss_distance().getMiles());
                closeApproachDataDto.setOrbiting_body(c.getOrbiting_body());
                //cargar lista
                closeApproachData_Dto_list.add(closeApproachDataDto);
            }

            
            AsteroidDto asteroidDto = new AsteroidDto(
                                                a.getLinks().getSelf(), a.getId(), a.getNeo_reference_id(),
                                                a.getName(), a.getNasa_jpl_url(), a.getAbsolute_magnitude_h(),
                                                
                                                a.getEstimated_diameter().getFeet().getEstimated_diameter_min(),
                                                a.getEstimated_diameter().getFeet().getEstimated_diameter_max(),

                                                a.getEstimated_diameter().getMeters().getEstimated_diameter_min(),
                                                a.getEstimated_diameter().getMeters().getEstimated_diameter_max(),

                                                a.getEstimated_diameter().getKilometers().getEstimated_diameter_min(),
                                                a.getEstimated_diameter().getKilometers().getEstimated_diameter_max(),

                                                a.getEstimated_diameter().getMiles().getEstimated_diameter_min(),
                                                a.getEstimated_diameter().getMiles().getEstimated_diameter_max(),

                                                a.getIs_potentially_hazardous_asteroid(),

                                                closeApproachData_Dto_list,

                                                a.getIs_sentry_object(),
                                                
                                                a.getSentry_data());

                                    
            asteroid_dto_List.add(asteroidDto);

        }
        
        return asteroid_dto_List;
    }
    

}
