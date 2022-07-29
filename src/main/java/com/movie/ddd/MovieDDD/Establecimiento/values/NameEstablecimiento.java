package com.movie.ddd.MovieDDD.Establecimiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NameEstablecimiento implements ValueObject<String> {
    private final String value;

    public NameEstablecimiento(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre del cine está vacío");
        }
    }
    public String value(){
        return value;
    }
}

