package com.movie.ddd.MovieDDD.Bill.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.values.CinemaTicketId;
import com.movie.ddd.MovieDDD.Bill.values.Description;

public class TicketDescriptionUpdated extends DomainEvent {
    private final CinemaTicketId cinemaTicketId;
    private final Description description;

    public TicketDescriptionUpdated(CinemaTicketId cinemaTicketId, Description description) {
        super("com.movie.ddd.MovieDDD.bill.ticketdescriptionupdated");
        this.cinemaTicketId = cinemaTicketId;
        this.description = description;
    }

    public CinemaTicketId getCinemaTicketId() {
        return cinemaTicketId;
    }

    public Description getDescription() {
        return description;
    }
}
