package com.movie.ddd.MovieDDD.Bill.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Description implements ValueObject<String> {
    private final String value;

    public Description(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La descripción no debe estar vacía");
        }
    }

            @Override
            public String value () {
                return value;
            }

            @Override
            public boolean equals (Object o){
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Description that = (Description) o;
                return Objects.equals(value, that.value);
            }

            @Override
            public int hashCode () {
                return Objects.hash(value);
            }
        }

