package com.movie.ddd.MovieDDD.Establecimiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Price implements ValueObject<String> {
    private final String value;

    public Price(String value) {
        this.value = Objects.requireNonNull(value);

    }

    public String value() {
        return value;
    }
}

