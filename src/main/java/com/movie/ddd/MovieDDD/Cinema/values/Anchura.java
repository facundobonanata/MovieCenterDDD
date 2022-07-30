package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Anchura implements ValueObject<Integer> {

    private final Integer value;

    public Anchura(Integer value){
        this.value = Objects.requireNonNull(value);
        if(this.value == 0){
            throw new IllegalArgumentException(("La anchura no puede ser cero"));
        }
        if(this.value < 50){
            throw new IllegalArgumentException("La anchura debe ser mayor a 50");
        }
    }

    public Anchura cambiarAnchura(Integer anchuraCambiar){
        return new Anchura(anchuraCambiar);
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anchura anchura = (Anchura) o;
        return Objects.equals(value, anchura.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
