package com.movie.ddd.MovieDDD.Bill.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Value implements ValueObject<Integer> {
    private final Integer value;

    public Value(Integer value){
        this.value = value;
        if(this.value < 0){
            throw new IllegalArgumentException("El valor no debe ser negativo");
        }
    }

    public Value modificarValor(Integer valorModificar){
        return new Value(valorModificar);
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


