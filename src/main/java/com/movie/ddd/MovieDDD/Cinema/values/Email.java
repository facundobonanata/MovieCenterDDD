package com.movie.ddd.MovieDDD.Cinema.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class Email implements ValueObject<String> {
    private final String value;

    public Email(String value){
        this.value=Objects.requireNonNull(value);
}
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
