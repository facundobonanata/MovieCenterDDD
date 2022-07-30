package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NameManager implements ValueObject<String> {
    private final String name;
    private final String surname;


    public NameManager(String name, String surname) {
        this.name = Objects.requireNonNull(name);
        this.surname =  Objects.requireNonNull(surname);
    }

    @Override
    public String value() {
        return this.name + " " + this.surname;
    }
}

