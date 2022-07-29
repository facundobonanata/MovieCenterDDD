package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.SeatId;
import com.movie.ddd.MovieDDD.Cinema.values.SeatType;

public class SeatAdded extends DomainEvent {
    private final SeatId seatId;
    private final SeatType seatType;

    public SeatAdded(SeatId seatId, SeatType seatType) {
        super("com.movie.ddd.MovieDDD.cinema.SeatAdded");
        this.seatId = seatId;
        this.seatType = seatType;
    }

    public SeatId getSeatId() {
        return seatId;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}
