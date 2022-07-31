package com.movie.ddd.MovieDDD.Cinema.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Cinema.values.SeatId;

public class Seat extends Entity<SeatId> {
    private SeatId seatId;

    public Seat(SeatId entityId) {
        super(entityId);
    }

    public SeatId getSeatId() {
        return seatId;
    }
}
