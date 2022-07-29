package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.Identity;
import com.movie.ddd.MovieDDD.Cinema.Cinema;

public class CinemaId extends Identity {
    public CinemaId(String id){
        super(id);
    }
    public CinemaId(){

    }
    public static CinemaId of(String id){
        return new CinemaId(id);
    }

    }
