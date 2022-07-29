package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.Identity;

public class ManagerId extends Identity {
    public ManagerId(String id){
        super(id);
    }
    public ManagerId(){

    }
    public static ManagerId of(String id){
        return new ManagerId(id);
    }
}
