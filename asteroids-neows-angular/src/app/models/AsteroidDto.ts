import { CloseApproachDataDto } from "./CloseApproachDataDto";

export class AsteroidDto {

    link_asteroid! :  string;
    id! : string;
    neo_reference_id! : string;
    name! : string;
    nasa_jpl_url! : string;
    absolute_magnitude_h! : string;
    feet_estimated_diameter_min! : number;
    feet_estimated_diameter_max! : number;
    meter_estimated_diameter_min! : number;
    meter_estimated_diameter_max! : number;
    kilometer_estimated_diameter_min! : number;
    kilometer_estimated_diameter_max! : number;
    mile_estimated_diameter_min! : number;
    mile_estimated_diameter_max! : number;
    is_potentially_hazardous_asteroid! : boolean;
    close_approach_data_dto : CloseApproachDataDto[] = [];
    is_sentry_object! : boolean;
    sentry_data! : string;

}

