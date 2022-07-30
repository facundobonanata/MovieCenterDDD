package com.movie.ddd.MovieDDD.Bill.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Bill.entities.CinemaTicket;
import com.movie.ddd.MovieDDD.Bill.values.BillId;
import com.movie.ddd.MovieDDD.Bill.values.CinemaTicketId;
import com.movie.ddd.MovieDDD.Bill.values.Description;

public class UpdateDescriptionTicket extends Command {
    private final BillId billId;
    private final CinemaTicketId cinemaTicketId;
    private final Description description;

    public UpdateDescriptionTicket(BillId billId, CinemaTicketId cinemaTicketId, Description description) {
        this.billId = billId;
        this.cinemaTicketId = cinemaTicketId;
        this.description = description;
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
}
