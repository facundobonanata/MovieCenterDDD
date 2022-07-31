package com.movie.ddd.MovieDDD.Bill.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class ExpirationDate implements ValueObject<String> {
    private final LocalDate date;
    private final String value;
    public ExpirationDate(int day, int month, int year) {
        try{
            date = LocalDate.of(year,month,day);
        }catch (DateTimeException ex){
            throw  new IllegalArgumentException(ex.getMessage());
        }
        value = generarFormato();
    }

    private String generarFormato(){
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }


    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpirationDate that = (ExpirationDate) o;
        return Objects.equals(date, that.date) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, value);
    }
}

