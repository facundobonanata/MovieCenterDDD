package com.movie.ddd.MovieDDD.Bill.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Bill.values.*;

public class AddTicket extends Command {
    private final BillId billId;
    private final CinemaTicketId cinemaTicketId;
    private final Description description;
    private final Value value;
    private final ExpirationDate expirationDate;

    public AddTicket(BillId billId, CinemaTicketId cinemaTicketId, Description description, Value value, ExpirationDate expirationDate) {
        this.billId = billId;
        this.cinemaTicketId = cinemaTicketId;
        this.description = description;
        this.value = value;
        this.expirationDate = expirationDate;
    }

    public BillId getBillId() {
        return billId;
    }

    public CinemaTicketId getCinemaTicketId() {
        return cinemaTicketId;
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

