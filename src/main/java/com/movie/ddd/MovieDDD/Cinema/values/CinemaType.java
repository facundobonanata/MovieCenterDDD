package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class CinemaType implements ValueObject<String> {

    private  final String value;

    public CinemaType(String value){
        Objects.requireNonNull(value, "Put cinema type");
        if(value.isBlank()){
            throw new IllegalReceiveException("The type is required");
        }
        this.value= value;
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaType CinemaType = (CinemaType) o;
        return Objects.equals(value, CinemaType.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


