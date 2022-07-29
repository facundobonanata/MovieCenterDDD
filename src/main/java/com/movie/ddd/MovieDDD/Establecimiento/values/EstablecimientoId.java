package com.movie.ddd.MovieDDD.Establecimiento.values;

import co.com.sofka.domain.generic.Identity;

public class EstablecimientoId extends Identity {
    public EstablecimientoId(){

    }

    private EstablecimientoId(String id){
        super(id);
    }

    public static EstablecimientoId of(String id){
        return new EstablecimientoId(id);
    }

}
