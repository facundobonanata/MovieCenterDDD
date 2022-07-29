package com.movie.ddd.MovieDDD.Establecimiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DateTime implements ValueObject<String> {

    private final String value;

    public DateTime(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Horario no establecido");
        }
    }

    public String value() {
        return value;
    }
}

