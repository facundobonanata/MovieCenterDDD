package com.movie.ddd.MovieDDD.Bill.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Value implements ValueObject<Integer> {
    private final Integer value;

    public Value(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Objects.equals(value, value.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


