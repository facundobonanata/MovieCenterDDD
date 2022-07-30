package com.movie.ddd.MovieDDD.Bill.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Bill.values.CinemaTicketId;
import com.movie.ddd.MovieDDD.Bill.values.Description;
import com.movie.ddd.MovieDDD.Bill.values.ExpirationDate;
import com.movie.ddd.MovieDDD.Bill.values.Value;

import java.util.Objects;

public class CinemaTicket extends Entity<CinemaTicketId> {
    private ExpirationDate expirationDate;
    private Value value;
    private Description description;

    public CinemaTicket(CinemaTicketId entityId, ExpirationDate expirationDate,  Value value, Description description) {
        super(entityId);
        this.expirationDate = expirationDate;
        this.value=value;
        this.description=description;
    }

    public void updateDescription(Description description){
        this.description = Objects.requireNonNull(description);
    }

    public void updateValue(Value valor){
        this.value = Objects.requireNonNull(value);
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public Value getValue() {
        return value;
    }

    public Description getDescription() {
        return description;
    }
}
