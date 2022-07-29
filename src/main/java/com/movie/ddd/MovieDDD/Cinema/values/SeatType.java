package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class SeatType implements ValueObject<String> {
    private  final String value;

    public SeatType(String value){
        Objects.requireNonNull(value, "Put cinema type");
        if(value.isBlank()){
            throw new IllegalReceiveException("The type is required");
        }
        this.value= value;
    }


    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeatType SeatType = (SeatType) o;
        return Objects.equals(value, SeatType.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


