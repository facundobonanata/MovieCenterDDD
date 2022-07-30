package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IsFinished implements ValueObject<Boolean> {

    private final Boolean value;

    public IsFinished(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsFinished that = (IsFinished) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
