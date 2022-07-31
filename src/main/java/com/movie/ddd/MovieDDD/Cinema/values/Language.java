package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Language implements ValueObject<String> {
    private final String value;

    public Language(String value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language idioma = (Language) o;
        return Objects.equals(value, idioma.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

