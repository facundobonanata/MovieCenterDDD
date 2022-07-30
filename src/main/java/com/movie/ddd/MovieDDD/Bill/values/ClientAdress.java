package com.movie.ddd.MovieDDD.Bill.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ClientAdress implements ValueObject<String> {
    private final String value;

    public ClientAdress(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La dirección no debe estar vacía");
        }
        if(this.value.length() >= 200){
            throw new IllegalArgumentException("La dirección no debe tener más de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientAdress clientAdress = (ClientAdress) o;
        return Objects.equals(value, clientAdress.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

