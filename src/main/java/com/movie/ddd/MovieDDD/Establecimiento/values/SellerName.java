package com.movie.ddd.MovieDDD.Establecimiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SellerName implements ValueObject<String> {
    private final String value;

    public SellerName(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre del taquillero no debe estar vacío");
        }
        if(this.value.length() <= 3){
            throw new IllegalArgumentException("El nombre del taquillero debe tener más de 3 caracteres");
        }
    }

    public SellerName modificarNombreTaquillero(String nombreTaquilleroModificar){
        return new SellerName(nombreTaquilleroModificar);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerName that = (SellerName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

