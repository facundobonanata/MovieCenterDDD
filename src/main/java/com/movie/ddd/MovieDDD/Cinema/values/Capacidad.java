package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Capacidad implements ValueObject<Integer> {

    private final Integer value;

    public Capacidad(Integer value){
        this.value = Objects.requireNonNull(value);
        if(this.value <= 20){
            throw new IllegalArgumentException("La capacidad debe ser mayor a 20");
        }
        if(this.value == 0){
            throw new IllegalArgumentException("La capacidad no debe ser cero");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capacidad capacidad = (Capacidad) o;
        return Objects.equals(value, capacidad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
