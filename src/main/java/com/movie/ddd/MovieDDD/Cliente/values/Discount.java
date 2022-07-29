package com.movie.ddd.MovieDDD.Cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Discount implements ValueObject {
    private final Double value;

    public Discount(Double value){
        Objects.requireNonNull(value);
        if (value < 1 ) {
            throw new IllegalArgumentException("El descuento no puede ser igual o menor a cero");
        }
        this.value = value;

    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return Objects.equals(value, discount.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

