package com.movie.ddd.MovieDDD.Cinema.entities;

import com.movie.ddd.MovieDDD.Cinema.values.SeatId;
import com.movie.ddd.MovieDDD.Cinema.values.SeatType;
import co.com.sofka.domain.generic.Entity;

public class Seat extends Entity<SeatId> {
    private SeatType seatType;

    public Seat(SeatId entityId, SeatType seatType) {
        super(entityId);
        this.seatType = seatType;
    }
    public void cambiarAnchura(SeatType seatType){
        this.seatType = seatType;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}
