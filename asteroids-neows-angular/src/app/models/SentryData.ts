
export class SentryData {

    links! : Link_SentryData;
    spkId! : string;
    designation! : string; 
    sentryId! : string;
    fullname! : string;
    year_range_min! : string;
    year_range_max! : string;
    potential_impacts! : string;
    impact_probability! : string;
    v_infinity! : string;
    absolute_magnitude! : string;
    estimated_diameter! : string;
    palermo_scale_ave! : string;
    Palermo_scale_max! : string;
    torino_scale! : string;
    last_obs! : string;
    last_obs_jd! : string;
    is_active_sentry_object! : boolean;
    url_impact_details! : string;
    url_orbital_element_details! : string;
    average_lunar_distance! : number

}


class Link_SentryData {
    near_earth_object_parent! : string; 
    self! : string; 
}