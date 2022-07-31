package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NameManager implements ValueObject<String> {
    private final String value;

    public NameManager(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public NameManager UpdateNameManager(String nameupdate){

        return new NameManager(nameupdate);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameManager nameManager = (NameManager) o;
        return Objects.equals(value, nameManager.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
