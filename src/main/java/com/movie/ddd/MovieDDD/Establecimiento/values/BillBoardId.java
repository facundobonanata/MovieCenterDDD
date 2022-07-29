package com.movie.ddd.MovieDDD.Establecimiento.values;

import co.com.sofka.domain.generic.Identity;

public class BillBoardId extends Identity {
    public BillBoardId(){

    }

    public BillBoardId(String id){
        super(id);
    }

    public static BillBoardId of(String id){
        return new BillBoardId(id);

    }
}

