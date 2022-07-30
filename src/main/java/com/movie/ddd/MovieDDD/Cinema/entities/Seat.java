package com.movie.ddd.MovieDDD.Cinema.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Cinema.values.Anchura;
import com.movie.ddd.MovieDDD.Cinema.values.SeatId;

public class Seat extends Entity<SeatId> {
    private Anchura anchura;

    public Seat(SeatId entityId, Anchura anchura) {
        super(entityId);
        this.anchura = anchura;
    }


    public Anchura anchura() {
        return anchura;
    }
}
