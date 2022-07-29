package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Seat implements ValueObject<String> {
    private  final String value;

    public Seat( String value){
        this.value = value;
        Objects.requireNonNull(value,  "Debes de tener una silla");

    }
    public String value() {
        return value;
    }

    public String getValue() {
        return value;
    }
}

