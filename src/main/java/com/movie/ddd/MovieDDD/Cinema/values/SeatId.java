package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.Identity;

public class SeatId extends Identity {
    public SeatId (String id){
        super(id);
    }
    public SeatId(){

    }
    public static SeatId of(String id){
        return new SeatId(id);

    }
}
