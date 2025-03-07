export class CloseApproachDataDto {
    close_approach_date! : string; 
    close_approach_date_full! : string
    epoch_date_close_approach! : string; 
    kilometers_per_second! : string; 
    kilometers_per_hour! : string; 
    miles_per_hour! : string; 
    astronomical! : string; 
    lunar! : string; 
    kilometers! : string; 
    miles! : string; 
    orbiting_body! : string; 


    constructor(close_approach_date : string,  
                close_approach_date_full : string,
                epoch_date_close_approach : string, 
                kilometers_per_second : string,
                kilometers_per_hour : string, 
                miles_per_hour : string, 
                astronomical : string,
                lunar : string,
                kilometers : string, 
                miles : string, 
                orbiting_body : string, 
                
                ){
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
}

