package com.movie.ddd.MovieDDD.Bill.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.entities.CinemaTicket;
import com.movie.ddd.MovieDDD.Bill.values.CinemaTicketId;
import com.movie.ddd.MovieDDD.Bill.values.Description;
import com.movie.ddd.MovieDDD.Bill.values.ExpirationDate;
import com.movie.ddd.MovieDDD.Bill.values.Value;

public class TicketAdded  extends DomainEvent {
    private final CinemaTicketId entityId;
    private final Description description;
    private final Value value;
    private final ExpirationDate expirationDate;

    public TicketAdded(CinemaTicketId entityId, Description description, Value value, ExpirationDate expirationDate) {
        super("com.movie.ddd.MovieDDD.bill.ticketadded");
        this.entityId = entityId;
        this.description = description;
        this.value = value;
        this.expirationDate = expirationDate;
    }

    public CinemaTicketId getEntityId() {
        return entityId;
    }

    public Description getDescription() {
        return description;
    }

    public Value getValue() {
        return value;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }
}
