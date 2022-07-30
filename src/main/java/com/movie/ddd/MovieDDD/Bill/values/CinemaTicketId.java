package com.movie.ddd.MovieDDD.Bill.values;

import co.com.sofka.domain.generic.Identity;

public class CinemaTicketId extends Identity {
    public CinemaTicketId(){

    }

    private CinemaTicketId(String id){
        super(id);
    }

    public static CinemaTicketId of(String id){
        return new CinemaTicketId(id);
    }

}

