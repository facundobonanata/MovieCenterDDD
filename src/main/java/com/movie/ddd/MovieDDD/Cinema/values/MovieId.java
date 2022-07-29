package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.Identity;

public class MovieId extends Identity {
    public MovieId(String id){
        super(id);
    }
    public MovieId(){

    }
        public static MovieId of(String id){

        return new MovieId(id);
        }
    }

