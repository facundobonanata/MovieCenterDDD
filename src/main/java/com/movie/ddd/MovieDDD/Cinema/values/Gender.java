package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Gender implements ValueObject<String> {
    private final String value;

    public Gender(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El género de la película no puede estar vacío");
        }
        if(this.value.length() >= 20){
            throw new IllegalArgumentException("El género de la película no puede tener más de 20 caracteres");
        }
    }

    public Gender modificarGenero(String generoModificar){
        return new Gender(generoModificar);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender genero = (Gender) o;
        return Objects.equals(value, genero.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
